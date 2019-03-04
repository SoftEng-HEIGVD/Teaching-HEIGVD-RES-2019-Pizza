package ch.heigvd.res.pizza.domain.IxSysTech;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.IxSysTech.Margueritte;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MargueritteTest {

    @Test
    void thePriceAndNameForMargheritaShouldBeCorrect() {
        Margueritte beer = new Margueritte();
        assertEquals(beer.getName(), Margueritte.NAME);
        assertEquals(beer.getPrice(), Margueritte.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForMargherita() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.IxSysTech.Margueritte";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Margueritte.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}