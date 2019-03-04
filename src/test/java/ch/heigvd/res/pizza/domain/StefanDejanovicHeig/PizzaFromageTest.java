package ch.heigvd.res.pizza.domain.StefanDejanovicHeig;

import ch.heigvd.res.pizza.protocol.GreetingsRequest;
import ch.heigvd.res.pizza.protocol.GreetingsResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaFromageTest {

  @Test
  void aPizzaFromageShouldReplyToGreetings() {
    PizzaFromage luigi = new PizzaFromage();
    GreetingsRequest request = new GreetingsRequest("Hi there");
    GreetingsResponse response = luigi.greet(request);
    assertEquals("hello, how can I help you?", response.getText());
  }

}