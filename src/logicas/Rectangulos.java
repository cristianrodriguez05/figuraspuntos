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
public class Rectangulos extends Figura{
    private float distanciap;
    private float diferenciaaltp;
    private float diferenciabasp;
    public float getDiferenciaaltp() {
        return diferenciaaltp;
    }

    public void setDiferenciaaltp(float diferenciaaltp) {
        this.diferenciaaltp = diferenciaaltp;
    }

    public float getDiferenciabasp() {
        return diferenciabasp;
    }

    public void setDiferenciabasp(float diferenciabasp) {
        this.diferenciabasp = diferenciabasp;
    }


    public float getDistanciap() {
        return distanciap;
    }

    public void setDistanciap(float distanciap) {
        this.distanciap = distanciap;
    }

    public void calcularArea() {
          this.area=this.diferenciaaltp*this.diferenciabasp;
    }

    public void calcularPerimetro() {
       this.perimetro=2*(this.diferenciaaltp+this.diferenciabasp);
    }
    
}
