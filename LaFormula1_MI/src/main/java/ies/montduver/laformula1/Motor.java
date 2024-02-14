/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author iretorros
 */
public class Motor {
    String tipo;
    double cilindrada;
    int potencia;

    
    public Motor() {
    }

    
    public Motor(String tipo, double cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" + '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Motor(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
    
}
