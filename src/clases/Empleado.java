package clases;

import interfaz.Planilla;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.*;
import java.util.concurrent.*;

/**
 *
 * @author William Sapón
 */
public abstract class Empleado implements Planilla {

    //ATRIBUTOS
    private float salario;
    private Date fecha_ingreso;
    private float bonificacion;
    private char regimen;
    
    // CONSTRUCTORES
     public Empleado(float salario, Date fecha_ingreso, float bonificacion, char regimen) {
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
        this.bonificacion = bonificacion;
        this.regimen = regimen;
    }
     
    public Empleado() {
        this.salario = 0;
        this.fecha_ingreso = null;
        this.bonificacion = 0;
        this.regimen = '\u0000';
    }
     
    
    //METODOS
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }

    public char getRegimen() {
        return regimen;
    }

    public void setRegimen(char regimen) {
        this.regimen = regimen;
    }
    
    protected abstract float calculaIVA(char regimen);

    @Override
    public float calculaIGSS(float salario) {
       float igss = salario * 0.0483f;
       return igss;
    }

    @Override
    public float calculaBono14(float salario, Date fecha_ingreso) {
        //OBTENIENDO LA FECHA ACTUAL
        Calendar fecha = new GregorianCalendar();
        
        //OBTENEMOS AÑO, MES Y DIA DEL SISTEMA
        int anio = fecha.get(Calendar.YEAR)-1900;
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        //OBTENESMO
        int dias_bono;
        
        Date fecha_actual = new Date(anio,mes,dia);
        int dias_Empleado =(int) ((fecha_actual.getTime()-fecha_ingreso.getTime())/(1000*60*60*24));//##
        
        //Calculando pago de bono 14 proporcinal a lo que va del año
        Date fecha_bono;
        /*
         * TODO: A un futuro hay que insertar le el campo para designar fecha de despido
         * de lo contrario se tomara la fecha del sistema(El dia de hoy)
         */
        
        // Si la fecha del sistema es menor que julio utilizaremos
        if(mes < 7){
            fecha_bono = new Date(anio-1,Calendar.JULY,1);
        } else {
            fecha_bono = new Date(anio,Calendar.JULY,1);
        }
        
        
        
        if (fecha_ingreso.before(fecha_bono)){
            dias_bono =(int) ((fecha_actual.getTime()-fecha_bono.getTime())/(1000*60*60*24));//## de dias
        } else {
            dias_bono =(int) ((fecha_actual.getTime()-fecha_ingreso.getTime())/(1000*60*60*24));//## de dias
        }
        
        float bono = (salario/365)*dias_bono;
        
        return bono;
    }

    @Override
    public float calculaAguinaldo(float salario, Date fecha_ingreso) {
        //OBTENIENDO LA FECHA ACTUAL
        Calendar fecha = new GregorianCalendar();
        
        //OBTENEMOS AÑO, MES Y DIA DEL SISTEMA
        int anio = fecha.get(Calendar.YEAR)-1900;
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        //OBTENESMO
        int dias_aguinaldo;
        
        Date fecha_actual = new Date(anio,mes,dia);
        int dias_Empleado =(int) ((fecha_actual.getTime()-fecha_ingreso.getTime())/(1000*60*60*24));//##
        
        //Calculando pago de bono 14 proporcinal a lo que va del año
        Date fecha_aguinaldo;
        /*
         * TODO: A un futuro hay que insertar le el campo para designar fecha de despido
         * de lo contrario se tomara la fecha del sistema(El dia de hoy)
         */
        
        // Si la fecha del sistema es menor que julio utilizaremos
        if(mes < 12){
            fecha_aguinaldo = new Date(anio-1,Calendar.DECEMBER,1);
        } else {
            fecha_aguinaldo = new Date(anio,Calendar.DECEMBER,1);
        }
        
        
        
        if (fecha_ingreso.before(fecha_aguinaldo)){
            dias_aguinaldo =(int) ((fecha_actual.getTime()-fecha_aguinaldo.getTime())/(1000*60*60*24));//## de dias
        } else {
            dias_aguinaldo =(int) ((fecha_actual.getTime()-fecha_ingreso.getTime())/(1000*60*60*24));//## de dias
        }
        
        float aguinaldo = (salario/365)*dias_aguinaldo;
        
        return aguinaldo;
    }

    @Override
    public float calculaIndemnizacion(float salario, Date fecha_ingreso) {
        //OBTENIENDO LA FECHA ACTUAL
        Calendar fecha = new GregorianCalendar();
        
        //OBTENEMOS AÑO, MES Y DIA DEL SISTEMA
        int anio = fecha.get(Calendar.YEAR)-1900;
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        Date fecha_actual = new Date(anio,mes,dia);
        int dias_trabajados =(int) ((fecha_actual.getTime()-fecha_ingreso.getTime())/(1000*60*60*24));//##
                
        while(dias_trabajados>=365){
            dias_trabajados -= 365;
            System.out.println("Dias en el while: " + dias_trabajados);
        }
        System.out.println("***************************");
        System.out.println("Dias liego de while: " + dias_trabajados);
        
        
        return 0.0f;
    }
    
    @Override
    public String toString() {
        return "Empleado: " + "salario=" + salario + ", fecha_ingreso=" + fecha_ingreso + ", bonificacion=" + bonificacion + ", regimen=" + regimen + '.';
    }
    
}
