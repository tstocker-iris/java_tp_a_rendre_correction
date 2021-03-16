package com.company.exo2;

public class Poisson extends Animal{
    public Poisson(String pNom) {
        super(pNom);
    }
    public Poisson() {
    }

    public String getType()
    {
        String response = super.getType();
        response += " Je suis un poisson.";
        return response;
    }
}
