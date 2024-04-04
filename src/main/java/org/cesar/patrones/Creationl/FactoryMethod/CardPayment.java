package org.cesar.patrones.Creationl.FactoryMethod;

public class CardPayment implements PaymentMethod{
    @Override
    public String doPayment() {
        String string = ("Pagando con tarjeta");
        return string;
    }
}
