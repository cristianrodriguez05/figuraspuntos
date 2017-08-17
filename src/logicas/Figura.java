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
public abstract class Figura {
    protected float area;
    protected float perimetro;
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    public float getArea(){
        return this.area;
    }
    public float getPerimetro(){
        return this.perimetro;
    }
}
