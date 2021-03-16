package com.company.exo3;

public class Camion extends Vehicule{
    protected int nbreEssieu;
    protected double poidsTotal;

    final double PRIX_PAR_ESSIEU = 7.0;
    final double PRIX_PAR_TONNE = 15.0;

    public Camion(int pNbreEssieu, double pPoidsTotal) {
        nbreEssieu = pNbreEssieu;
        poidsTotal = pPoidsTotal;
    }

    public int getNbreEssieu(){
        return this.nbreEssieu;
    }

    public double getPoidsTotal()
    {
        return this.poidsTotal;
    }

    public double getTaxe()
    {
        return (this.getNbreEssieu() * PRIX_PAR_ESSIEU) + (this.getPoidsTotal() * PRIX_PAR_TONNE);
    }
}
