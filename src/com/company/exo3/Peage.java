package com.company.exo3;

public class Peage {
    protected int id;
    protected int nbreVehicule;
    protected int nbreVoiture;
    protected int nbreMoto;
    protected int nbreCamion;
    protected double totalCaisse;


    public Peage(int pId) {
        this.id = pId;
        this.nbreVehicule = 0;
        this.nbreVoiture = 0;
        this.nbreCamion = 0;
        this.nbreMoto = 0;
        this.totalCaisse = 0;
    }

    public void passerVehicule(Vehicule vehicule) {
        String typeVehicule = "véhicule";
        this.nbreVehicule++;
        if (vehicule instanceof Camion) {
            this.nbreCamion++;
            typeVehicule = "Camion";
        } else if (vehicule instanceof Voiture) {
            this.nbreVoiture++;
            typeVehicule = "Voiture";
        } else if (vehicule instanceof Moto) {
            this.nbreMoto++;
            typeVehicule = "Moto";
        }
        this.totalCaisse += vehicule.getTaxe();
        System.out.println("Péage " + this.id + " - Un " + typeVehicule + " passe et paye " + vehicule.getTaxe() + "€");
    }

    public String toString()
    {
        return "Péage " + this.id + " a une caisse de " + this.totalCaisse + " € pour un total de " + this.nbreVehicule + " passés ("+this.nbreVoiture+" voitures, "+this.nbreCamion+" camions, "+this.nbreMoto+" motos).";
    }
}
