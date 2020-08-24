/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Date;

public interface Planilla {
    public float calculaIGSS(float salario);
    public float calculaBono14(float salario, Date fecha_ingreso);
    public float calculaAguinaldo(float salario, Date fecha_ingreso);
    public float calculaIndemnizacion(float salario, Date fecha_ingreso);
}
