package fr.eni.cycle;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {


    public Gyroroue(String marque, String modèle, LocalDate dateAchat, int autonomie) {
        super(marque, modèle, dateAchat, autonomie);
    }

    @Override
    public double getTarif() {
        return 18.90;
    }
}
