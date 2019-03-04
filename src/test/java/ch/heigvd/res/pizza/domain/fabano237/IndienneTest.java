package ch.heigvd.res.pizza.domain.fabano237;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndienneTest {

    @Test
    void thePriceAndNameForIndienneShouldBeCorrect() {
        Indienne beer = new Indienne();
        assertEquals(beer.getName(), Indienne.NAME);
        assertEquals(beer.getPrice(), Indienne.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForIndienne() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.wasadigi.Indienne";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Indienne.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
