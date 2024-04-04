package org.cesar.patrones.Creationl.FactoryMethod;

public class GooglePayment implements PaymentMethod{
    @Override
    public String doPayment() {
        String string = ("Pagando con Google");
        return string;
    }
}
