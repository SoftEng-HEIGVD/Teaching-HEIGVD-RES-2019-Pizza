package ch.heigvd.res.pizza.domain.Crulllo;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThonMayoTest {

    @Test
    void thePriceAndNameForThonMayoShouldBeCorrect() {
        ThonMayo beer = new ThonMayo();
        assertEquals(beer.getName(), ThonMayo.NAME);
        assertEquals(beer.getPrice(), ThonMayo.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForThonMayo() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.Crulllo.ThonMayo";
        int numberOfPizzas = 5;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = ThonMayo.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}