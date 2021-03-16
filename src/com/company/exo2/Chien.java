package com.company.exo2;

public class Chien extends Mammifere{
    public Chien(String pNom) {
        super(pNom);
    }
    public Chien() {
    }

    public String getType()
    {
        String response = super.getType();
        response += " Je suis un chien.";
        return response;
    }
}
