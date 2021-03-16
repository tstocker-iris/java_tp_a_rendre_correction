package com.company.exo3;

public class Main {

    public static void main(String[] args) {
        Peage p1 = new Peage(1);
        Peage p2 = new Peage(2);

        for (int i = 0; i < 50; i++) {
            int typeVehicule = getRandom(1, 10);
            Vehicule v;
            if (typeVehicule <= 3) {
                v = new Voiture();
            } else if (typeVehicule <= 6) {
                v = new Camion(getRandom(1, 4), getRandom(30, 50));
            } else {
                v = new Moto();
            }

            int numeroPeage = getRandom(1, 2);
            if (numeroPeage == 1) {
                p1.passerVehicule(v);
            } else {
                p2.passerVehicule(v);
            }
        }

        System.out.println(p1);
        System.out.println(p2);
    }

    public static int getRandom(int min, int max) {
        // define the range
        int range = max - min + 1;

        return (int)(Math.random() * range) + min;
    }
}
