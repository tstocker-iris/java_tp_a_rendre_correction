package com.company.exo4;

public class Lapin {

//    private static int nbLapinVivant = 0;
    private boolean vivant;

    private Lapin(boolean pVivant){
        this.vivant = pVivant;
    }

    public static Lapin creationLapin() {
//        if (nbLapinVivant < 50) {
//            nbLapinVivant++;
            System.out.println("Je créé un lapin !");
            return new Lapin(true);
//        }
//        System.out.println("Il y a trop de lapin en vie");
//        return null;
    }

    public void passeALaCasserole()
    {
        System.out.println("Un lapin est passé à la casserole");
        this.vivant = false;
//        nbLapinVivant--;
    }
}
