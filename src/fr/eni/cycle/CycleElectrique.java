package fr.eni.cycle;

import java.time.LocalDate;

/**
 * protected accede sur toute la descendance
 */

public abstract class CycleElectrique extends Cycle {
    protected int autonomie;

    public CycleElectrique(String marque, String modèle, LocalDate dateAchat, int autonomie) {
        super(marque, modèle, dateAchat);
        this.autonomie = autonomie;
    }


}
