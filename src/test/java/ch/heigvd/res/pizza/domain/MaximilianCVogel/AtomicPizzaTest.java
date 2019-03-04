package ch.heigvd.res.pizza.domain.MaximilianCVogel;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtomicPizzaTest {

  @Test
  void thePriceAndNameForMargheritaShouldBeCorrect() {
    AtomicPizza beer = new AtomicPizza();
    assertEquals(beer.getName(), AtomicPizza.NAME);
    assertEquals(beer.getPrice(), AtomicPizza.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForMargherita() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.MaximilianCVogel.AtomicPizza";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = AtomicPizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}