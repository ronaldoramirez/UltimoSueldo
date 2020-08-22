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
        return 0.0f;
    }
    
}
