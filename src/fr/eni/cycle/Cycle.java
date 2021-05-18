package fr.eni.cycle;

import java.time.LocalDate;

public abstract class Cycle {
    protected String marque;
    protected String modèle;
    protected LocalDate dateAchat;


    public Cycle(String marque, String modèle, LocalDate dateAchat) {
        this.marque = marque;
        this.modèle = modèle;
        this.dateAchat = dateAchat;
    }

    //DATE D'ACHAT
    public int age() {
        return this.dateAchat.until(LocalDate.now()).getYears();
    }

// TARIF
    public abstract double getTarif();

}
