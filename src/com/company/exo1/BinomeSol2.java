package com.company.exo1;

public class BinomeSol2 extends Binome {
    public BinomeSol2(double pa, double pb, double pc, double pdis) {
        super(pa, pb, pc, pdis);
    }

    public void calculer_racine()
    {
        System.out.println("L'équation admet " + this.nb_racine() + " solutions réelles : x1 = " + this.valeur_racine(1) + " et x2 = " + this.valeur_racine(2));
    }

    public int nb_racine()
    {
        return 2;
    }

    public double valeur_racine(int i)
    {
        if (i == 1) {
            return (-this.b - Math.sqrt(this.dis)) / 2 * this.a;
        } else if (i == 2) {
            return (-this.b + Math.sqrt(this.dis)) / 2 * this.a;
        }
        return 0.0;
    }
}
