package ch.heigvd.res.pizza.domain.Crulllo;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Hawai2Test {

    @Test
    void thePriceAndNameForHawai2ShouldBeCorrect() {
        Hawai2 beer = new Hawai2();
        assertEquals(beer.getName(), Hawai2.NAME);
        assertEquals(beer.getPrice(), Hawai2.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForHawai2() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.Crulllo.Hawai2";
        int numberOfPizzas = 4;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Hawai2.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}