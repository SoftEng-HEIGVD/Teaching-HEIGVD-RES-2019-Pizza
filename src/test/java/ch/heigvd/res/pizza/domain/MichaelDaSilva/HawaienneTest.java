package ch.heigvd.res.pizza.domain.MichaelDaSilva;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HawaienneTest {

  @Test
  void thePriceAndNameForHawaienneShouldBeCorrect() {
    Hawaienne pizza = new Hawaienne();
    assertEquals(pizza.getName(), Hawaienne.NAME);
    assertEquals(pizza.getPrice(), Hawaienne.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForHawaienne() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.MichaelDaSilva.Hawaienne";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Hawaienne.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}