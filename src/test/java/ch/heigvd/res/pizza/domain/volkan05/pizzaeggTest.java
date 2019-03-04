package ch.heigvd.res.pizza.domain.volkan05;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.volkan05.pizzaegg;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class pizzaeggTest {

  @Test
  void thePriceAndNameForMargheritaShouldBeCorrect() {
    pizzaeggTest beer = new pizzaeggTest();
    assertEquals(beer.getName(), pizzaeggTest.NAME);
    assertEquals(beer.getPrice(), pizzaeggTest.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForpizzaeggTest() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.volkan05.pizzaeggTest";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = pizzaeggTest.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}