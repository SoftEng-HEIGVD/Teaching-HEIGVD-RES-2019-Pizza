package ch.heigvd.res.pizza.domain.nfluckiger;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class eggPizza implements IProduct {

    public final static String NAME = "EggPizza";
    public final static BigDecimal PRICE = new BigDecimal(18.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
