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
public class Cuadrados extends Figura{
    private float distanciap;

    public void setDistanciap(float distanciap) {
        this.distanciap = distanciap;
    }
    public void calcularArea(){
        this.area=this.distanciap*this.distanciap;
    }
    public void calcularPerimetro(){
        this.perimetro=this.distanciap*4;
    }    
    public float getDistanciap() {
        return distanciap;
    }
}
