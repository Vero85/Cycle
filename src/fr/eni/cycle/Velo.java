package fr.eni.cycle;

import java.time.LocalDate;

public class Velo extends Cycle {
    private int nbVitesses;

    public Velo(String marque, String modèle, LocalDate dateAchat, int nbVitesses) {
        super(marque, modèle, dateAchat);
        this.nbVitesses = nbVitesses;
    }

    @Override
    public double getTarif() {
        return 4.90;
    }

    @Override
    public String toString() {
        return "Velo{" +
                "marque='" + marque + '\'' +
                ", \n modèle='" + modèle + '\'' +
                ", \n age=" + super.age() + " an" + (super.age() > 1 ? "s" : "") +
                ", \n nbVitesses=" + nbVitesses +
                ", \n tarif= " + this.getTarif() + " €/heure" +
                '}';
        // return String.format("%s %n %s %s", this.marque);
    }
}
