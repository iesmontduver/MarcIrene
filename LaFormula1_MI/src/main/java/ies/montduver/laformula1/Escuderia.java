/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author marmaroch
 */
public class Escuderia {
    String nom;
    Double pressupost;
    int punts;

    public Escuderia(String nom, Double pressupost, int punts) {
        this.nom = nom;
        this.pressupost = pressupost;
        this.punts = punts;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPressupost() {
        return pressupost;
    }

    public void setPressupost(Double pressupost) {
        this.pressupost = pressupost;
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }
    
}
