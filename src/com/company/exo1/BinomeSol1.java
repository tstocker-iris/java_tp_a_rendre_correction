package com.company.exo1;

public class BinomeSol1 extends Binome {
    public BinomeSol1(double pa, double pb, double pc, double pdis) {
        super(pa, pb, pc, pdis);
    }

    public void calculer_racine()
    {
        System.out.println("L'equation admet " + this.nb_racine() + " solution réelle x1 = " + this.valeur_racine(1));
    }

    public int nb_racine()
    {
        return 1;
    }

    public double valeur_racine(int i)
    {
        return -this.b / 2 * this.a;
    }
}
