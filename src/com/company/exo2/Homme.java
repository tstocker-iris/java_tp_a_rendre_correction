package com.company.exo2;

public class Homme extends Mammifere{
    public Homme(String pNom) {
        super(pNom);
    }

    public Homme() {
    }

    public String getType()
    {
        String response = super.getType();
        response += " Je suis un homme.";
        return response;
    }
}
