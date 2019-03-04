package ch.heigvd.res.pizza.domain.ncdm_stldr;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class NapoliTest {

    @Test
    void thePriceAndNameForNapoliShouldBeCorrect() {
        Napoli pizza = new Napoli();
        assertEquals(pizza.getName(), Napoli.NAME);
        assertEquals(pizza.getPrice(), Napoli.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForNapoli() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.ncdm_stldr.Napoli";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Napoli.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}