package com.company.exo4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Lapin> lapins = new ArrayList<Lapin>();

        for (int i = 0; i < 500; i++) {
            int action = getRandom(1, 100);
            if (action <= 75) {
                if (lapins.size() < 50) {
                    lapins.add(Lapin.creationLapin());
                } else {
                    System.out.println("Il y a trop de lapins en vie");
                }
            } else {
                if (lapins.size() > 0) {
                    Lapin tmp = lapins.get(getRandom(0, lapins.size() - 1));
                    if (tmp != null) {
                        tmp.passeALaCasserole();
                        lapins.remove(tmp);
                    }
                }
            }
        }
    }

    public static int getRandom(int min, int max) {
        // define the range
        int range = max - min + 1;

        return (int)(Math.random() * range) + min;
    }
}
