package ch.heigvd.res.pizza.domain.scout407;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuatreFromageTest {

    @Test
    void thePriceAndNameForMargheritaShouldBeCorrect() {
        QuatreFromage beer = new QuatreFromage();
        assertEquals(beer.getName(), QuatreFromage.NAME);
        assertEquals(beer.getPrice(), QuatreFromage.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForQuatreFormage() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.scout407.QuatreFromage";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = QuatreFromage.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}