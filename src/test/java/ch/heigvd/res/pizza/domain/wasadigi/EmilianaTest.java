package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmilianaTest {

  @Test
  void thePriceAndNameForMargheritaTestShouldBeCorrect() {
    Emiliana beer = new Emiliana();
    assertEquals(beer.getName(), Emiliana.NAME);
    assertEquals(beer.getPrice(), Emiliana.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForEmiliana() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.wasadigi.Emiliana";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Emiliana.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}