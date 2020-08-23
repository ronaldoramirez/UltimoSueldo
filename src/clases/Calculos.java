package clases;

import java.util.Date;

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
        if (regimen == 'P') {
            System.out.println("No es necesario calcular el iva por que tiene prestaciones");
        } else if (regimen == 'F') {
            iva = super.getSalario() * 0.12f;
        }
        return iva;
    }

    public float calculaSalario() {
        switch (super.getRegimen()) {
            case 'P':
                return super.getSalario()  
                     + super.getBonificacion() 
                     + super.calculaBono14(super.getSalario(), super.getFecha_ingreso()) 
                     + super.calculaAguinaldo(super.getSalario(), super.getFecha_ingreso())
                     + super.calculaIndemnizacion(super.getSalario(), super.getFecha_ingreso())
                     - super.calculaIGSS(super.getSalario());
            case 'F':
                char regimen = super.getRegimen();
                return super.getSalario() - this.calculaIVA(regimen);
            default:
                return 0.0f;
        }
    }
    
    public float calculaSubTotal(){
        switch (super.getRegimen()) {
            case 'P':
                return super.getSalario()  
                     + super.getBonificacion() 
                     + super.calculaBono14(super.getSalario(), super.getFecha_ingreso()) 
                     + super.calculaAguinaldo(super.getSalario(), super.getFecha_ingreso())
                     + super.calculaIndemnizacion(super.getSalario(), super.getFecha_ingreso());
            case 'F':
                return super.getSalario();
            default:
                return 0.0f;
        }
    }
    
    public float getIVA(){
        return this.calculaIVA(super.getRegimen());
    }
    
}
