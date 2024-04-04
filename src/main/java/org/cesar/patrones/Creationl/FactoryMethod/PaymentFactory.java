package org.cesar.patrones.Creationl.FactoryMethod;

public class PaymentFactory {
    public static PaymentMethod buildPayment (TypePayment typePayment){
        switch (typePayment){
            case CARD :
                return new CardPayment();
            case GOOGLEPAY:
                return new GooglePayment();
            default:
                return new CardPayment();
        }
    }
}
