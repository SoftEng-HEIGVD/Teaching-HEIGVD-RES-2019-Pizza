package ch.heigvd.res.pizza.domain.scout407;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class QuatreFromage implements IProduct {

    public final static String NAME = "4 Fromage";
    public final static BigDecimal PRICE = new BigDecimal(22.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}