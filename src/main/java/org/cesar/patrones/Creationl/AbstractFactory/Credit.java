package org.cesar.patrones.Creationl.AbstractFactory;

public class Credit implements PaymentMethod{

    @Override
    public String doPayment() {
        return "pago a credito";
    }
}
