package clases;

import java.util.Date;

/**
 *
 * @author William Sapón
 */
public class Calculos extends Empleado {
    private int dia, mes, anio;
    
    public Calculos(float salario, Date fecha_ingreso, float bonificacion, char regimen) {
        super(salario, fecha_ingreso, bonificacion, regimen);
    }
    
    public Calculos() {
        super();
    }
    
    @Override
    protected float calculaIVA(char regimen) {
        float iva = 0.0f;
        if (regimen == 'p'){
            System.out.println("No es necesario calcular el iva por que tiene prestaciones");
        }else if(regimen == 'f'){
            iva = super.getSalario() * 0.12f;
        }
        return iva;
    }
    
    protected float calculaSalario(){
        if(super.getRegimen() == 'p'){
            return super.getSalario()-super.calculaIGSS(super.getSalario() + super.getBonificacion());
        }
        else{
            char regimen = super.getRegimen();
             return super.getSalario() - this.calculaIVA(regimen);
        }
        
    }
       
}
