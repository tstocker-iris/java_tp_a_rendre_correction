package com.company.exo1;

public class Main {

    public static void main(String[] args) {

        Binome tampon = new Binome(1.0, 2.0, 3.0, 4.0);
        Binome binome0 = tampon.creation(1, 2.0, 4.0);
        binome0.calculer_racine();

        Binome binome1 = tampon.creation(-1, 6.0, -9.0);
        binome1.calculer_racine();

        Binome binome2 = Binome.staticCreation(1.0, 1.0, -2.0);
        binome2.calculer_racine();
    }
}
