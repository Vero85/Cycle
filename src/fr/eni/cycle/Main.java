package fr.eni.cycle;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cycle[] aLouer = new Cycle[6];
        Velo lapierre = new Velo("Lapierre", "speed 400", LocalDate.of(2018, 6, 21),27);
        aLouer[0] = lapierre;


        // i = laCase
        for (int laCase = 0; laCase < aLouer.length; laCase++) {
            if (aLouer[laCase] != null) {
                System.out.println(aLouer[laCase]);
            }
        }
/*
        for (int i = 0; i < aLouer.length; i++) {
            System.out.println(aLouer[i] != null ? aLouer [i] : "");
         }*/
        }

    }

