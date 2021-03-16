package com.company.exo2;

public class Mammifere extends Animal{
    public Mammifere(String pNom) {
        super(pNom);
    }

    public Mammifere() {
    }

    public String getType()
    {
        String response = super.getType();
        response += " Je suis un mammifère.";
        return response;
    }
}
