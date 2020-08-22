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
        //                                      01 01 2020
        //OBTENIENDO LA FECHA ACTUAL
        Calendar fecha = new GregorianCalendar();
  
        //OBTENEMOS AÑO, MES Y DIA DEL SISTEMA
        int anio = fecha.get(Calendar.YEAR)-1900;
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        Date fecha_actual = new Date(anio,mes,dia);
        float dias;
        dias = ((fecha_actual.getTime()-fecha_ingreso.getTime())/(1000*60*60*24));
        System.out.println("Dias: " + dias);
        return dias;
    }

    @Override
    public float calculaAguinaldo(float salario, Date fecha_ingreso) {
        return 0.0f;
    }

    @Override
    public float calculaIndemnizacion(float salario, Date fecha_ingreso) {
        return 0.0f;
    }
    
    @Override
    public String toString() {
        return "Empleado: " + "salario=" + salario + ", fecha_ingreso=" + fecha_ingreso + ", bonificacion=" + bonificacion + ", regimen=" + regimen + '.';
    }
    
}
