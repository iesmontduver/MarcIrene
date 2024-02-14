/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author iretorros
 */
public class Pilot {
    String nom;
    Escuderia Escuderia;
    int numero;
    int punts;
    double sou;

    public Pilot(String nom, Escuderia Escuderia, int numero, int punts, double sou) {
        this.nom = nom;
        this.Escuderia = Escuderia;
        this.numero = numero;
        this.punts = punts;
        this.sou = sou;
    }

    public String getNom() {
        return nom;
    }

    public Escuderia getEscuderia() {
        return Escuderia;
    }

    public int getNumero() {
        return numero;
    }

    public int getPunts() {
        return punts;
    }

    public double getSou() {
        return sou;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEscuderia(Escuderia Escuderia) {
        this.Escuderia = Escuderia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }
    
}

