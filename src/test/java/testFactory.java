import org.cesar.patrones.Creationl.AbstractFactory.AbstractFactory;
import org.cesar.patrones.Creationl.AbstractFactory.Card;
import org.cesar.patrones.Creationl.AbstractFactory.FactoryProvider;
import org.cesar.patrones.Creationl.AbstractFactory.PaymentMethodFactory;
import org.cesar.patrones.Creationl.FactoryMethod.CardPayment;
import org.cesar.patrones.Creationl.FactoryMethod.PaymentFactory;
import org.cesar.patrones.Creationl.FactoryMethod.PaymentMethod;
import org.cesar.patrones.Creationl.FactoryMethod.TypePayment;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testFactory {

    @Test
    public void testFactory(){
        PaymentMethod paymentMethod = PaymentFactory.buildPayment(TypePayment.CARD);
        assertEquals("Pagando con tarjetas", paymentMethod.doPayment());
    }

    @Test
    public void testAbstractFactory(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");

        Card card = (Card) abstractFactory.create("MASTERCARD");
        org.cesar.patrones.Creationl.AbstractFactory.PaymentMethod paymentMethod1 =
                (org.cesar.patrones.Creationl.AbstractFactory.PaymentMethod) abstractFactory1.create("CREDIT");

        assertEquals("MASTERCARD", card.getCardType());
        assertEquals("0000 0000 0000 1391", card.getCardNumber());
        assertEquals("pago a credito",paymentMethod1.doPayment());

    }

    @Test
    public void testBuilder(){
        org.cesar.patrones.Creationl.Builder.Card card = new org.cesar.patrones.Creationl.Builder.Card.CardBuilder("VISA",
                "0000 1111 2222 3333")
                .name("Alberto")
                .expires(2030)
                .credit(true)
                .build();

        System.out.println(card);

    }


}
