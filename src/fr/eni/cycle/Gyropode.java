package fr.eni.cycle;

import java.time.LocalDate;

/**
 * Gyropode
 *
 * tailleMinimum en centimètres
 */

public class Gyropode extends CycleElectrique {
    int piloteTailleMin;

    public Gyropode(String marque, String modèle, LocalDate dateAchat, int autonomie, int piloteTailleMin) {
        super(marque, modèle, dateAchat, autonomie);
        this.piloteTailleMin = piloteTailleMin;
    }

    @Override
    public double getTarif() {
        return 29.90;
    }
}
