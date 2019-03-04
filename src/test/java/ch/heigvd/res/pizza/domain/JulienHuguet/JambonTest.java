package ch.heigvd.res.pizza.domain.JulienHuguet;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JambonTest {
    @Test
    void thePriceAndNameForJambonShouldBeCorrect() {
        Jambon paysanne = new Jambon();
        assertEquals(paysanne.getName(), Jambon.NAME);
        assertEquals(paysanne.getPrice(), Jambon.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForJambon() {
        Pizzaiolo john = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.JulienHuguet.Jambon";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Jambon.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}