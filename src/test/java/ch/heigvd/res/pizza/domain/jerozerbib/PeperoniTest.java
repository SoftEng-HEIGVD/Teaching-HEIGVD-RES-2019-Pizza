 package ch.heigvd.res.pizza.domain.jerozerbib;
 
 import ch.heigvd.res.pizza.domain.Pizzaiolo;
 import ch.heigvd.res.pizza.protocol.OrderRequest;
 import ch.heigvd.res.pizza.protocol.OrderResponse;
 import org.junit.jupiter.api.Test;
 
 import java.math.BigDecimal;
 
 import static org.junit.jupiter.api.Assertions.assertEquals;
 
 class PepeorniTest {
 
   @Test
   void thePriceAndNameForPeproniShouldBeCorrect() {
     Peperoni beer = new Peperoni();
     assertEquals(beer.getName(), Peperoni.NAME);
     assertEquals(beer.getPrice(), Peperoni.PRICE);
   }
 
   @Test
   void aPizzaioloShouldAcceptAnOrderForPeperoni() {
     Pizzaiolo mario = new Pizzaiolo();
     String productName = "ch.heigvd.res.pizza.domain.jerozerbib.Peperoni";
     int numberOfPizzas = 2;
     OrderRequest request = new OrderRequest(numberOfPizzas, productName);
     OrderResponse response = mario.order(request);
     BigDecimal expectedTotalPrice = Peperoni.PRICE.multiply(new BigDecimal(numberOfPizzas));
     assertEquals(expectedTotalPrice, response.getTotalPrice());
   }
 
 }
