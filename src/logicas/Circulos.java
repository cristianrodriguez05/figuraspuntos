/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicas;

/**
 *
 * @author Estudiantes
 */
public class Circulos extends Figura{
    private float distanciap;

    public void setDistanciap(float distanciap) {
        this.distanciap = distanciap;
    }
    public void calcularArea() {
       this.area=(float) (Math.PI*(this.distanciap*this.distanciap));
    }
    public void calcularPerimetro() {
       this.perimetro=(float) ((Math.PI*2)*this.distanciap);
    }
    public float getDistanciap() {
        return distanciap;
    }
    
}
