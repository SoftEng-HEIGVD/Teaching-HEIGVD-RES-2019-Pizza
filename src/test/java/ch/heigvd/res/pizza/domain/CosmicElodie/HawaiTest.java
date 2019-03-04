package ch.heigvd.res.chill.domain.CosmicElodie;

import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import org.junit.jupiter.api.Test;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;

class HawaiTest
{
    @Test
    void PriceAndNameForHawaiShouldBeCorrect() {
        Hawai Pizza = new Hawai();
        assertEquals(beer.getName(), Pizza1.NAME);
        assertEquals(beer.getPrice(), Pizza1.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForHawai() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.Hawai";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Hawai.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}