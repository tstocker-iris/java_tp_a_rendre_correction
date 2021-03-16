package com.company.exo2;

public class Animal {
    protected String nom;

    public Animal(String pNom) {
        nom = pNom;
    }
    public Animal() {
        nom = "";
    }

    public String getType()
    {
        String response = "Je suis un animal";
        if (this.nom.compareTo("") != 0) {
            response += " de nom " + this.nom;
        }
        response += ".";
        return response;
    }
}
