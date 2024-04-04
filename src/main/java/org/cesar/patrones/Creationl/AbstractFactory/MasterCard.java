package org.cesar.patrones.Creationl.AbstractFactory;

public class MasterCard implements Card{
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000 1391";
    }
}
