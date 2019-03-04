package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 4FromagesTest {

  @Test
  void thePriceAndNameFor4FromagesShouldBeCorrect() {
    4Fromages beer = new 4Fromages();
    assertEquals(beer.getName(), 4Fromages.NAME);
    assertEquals(beer.getPrice(), 4Fromages.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderFor4Fromages() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.wasadigi.4Fromages";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = 4Fromages.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}