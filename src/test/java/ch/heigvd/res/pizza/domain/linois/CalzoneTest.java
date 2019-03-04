package ch.heigvd.res.pizza.domain.linois;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalzoneTest {

  @Test
  void thePriceAndNameForCalzoneShouldBeCorrect() {
    Calzone beer = new Calzone();
    assertEquals(beer.getName(), Calzone.NAME);
    assertEquals(beer.getPrice(), Calzone.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForCalzone() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.linois.Calzone";
    int numberOfPizzas = 3;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Calzone.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}