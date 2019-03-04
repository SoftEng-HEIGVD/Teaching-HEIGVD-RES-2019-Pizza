package ch.heigvd.res.pizza.domain.CosmicElodie;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class hawai2 implements IProduct {
    public final static String NAME = "Hawai2";
    public final static BigDecimal PRICE = new BigDecimal(20);

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public BigDecimal getPrice()
    {
        return PRICE;
    }
}
