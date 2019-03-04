package ch.heigvd.res.pizza.domain.Remy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1Test {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	package ch.heigvd.res.pizza.domain.Remy;

	import ch.heigvd.res.pizza.domain.Pizzaiolo;
	import ch.heigvd.res.pizza.protocol.OrderRequest;
	import ch.heigvd.res.pizza.protocol.OrderResponse;
	import org.junit.jupiter.api.Test;

	import java.math.BigDecimal;

	import static org.junit.jupiter.api.Assertions.assertEquals;

	class Test1test {

	  @Test
	  void thePriceAndNameForTest1ShouldBeCorrect() {
		  Test1 beer = new Test1();
	    assertEquals(beer.getName(), Test1.NAME);
	    assertEquals(beer.getPrice(), Test1.PRICE);
	  }

	  @Test
	  void aPizzaioloShouldAcceptAnOrderForTest1() {
	    Pizzaiolo mario = new Pizzaiolo();
	    String productName = "ch.heigvd.res.pizza.domain.Remy.Test1";
	    int numberOfPizzas = 2;
	    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
	    OrderResponse response = mario.order(request);
	    BigDecimal expectedTotalPrice = Ananas.PRICE.multiply(new BigDecimal(numberOfPizzas));
	    assertEquals(expectedTotalPrice, response.getTotalPrice());
	  }

	}
}
