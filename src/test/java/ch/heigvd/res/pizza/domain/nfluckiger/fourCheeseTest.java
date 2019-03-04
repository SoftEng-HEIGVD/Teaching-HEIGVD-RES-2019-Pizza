package ch.heigvd.res.pizza.domain.nfluckiger;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MargheritaTest {

    @Test
    void thePriceAndNameForfourCheeseShouldBeCorrect() {
        fourCheese pizza = new fourCheese();
        assertEquals(pizza.getName(), fourCheese.NAME);
        assertEquals(pizza.getPrice(), fourCheese.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForfourCheese() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.wasadigi.Margherita";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = fourCheese.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}