package ch.heigvd.res.chill.domain.CosmicElodie;

import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import org.junit.jupiter.api.Test;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;

class BlueMoonTest
{
    @Test
    void PriceAndNameForPizza1ShouldBeCorrect() {
        Pizza1 beer = new Pizza1();
        assertEquals(beer.getName(), Pizza1.NAME);
        assertEquals(beer.getPrice(), Pizza1.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPizza1() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.Pizza1";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Pizza1.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}