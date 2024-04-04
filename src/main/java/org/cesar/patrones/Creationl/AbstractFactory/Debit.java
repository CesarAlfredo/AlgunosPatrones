package org.cesar.patrones.Creationl.AbstractFactory;

import org.cesar.patrones.Creationl.AbstractFactory.PaymentMethod;

public class Debit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "pago a debito";
    }
}
