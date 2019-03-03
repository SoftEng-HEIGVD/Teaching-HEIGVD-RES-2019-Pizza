package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Emiliana implements IProduct {

  public final static String NAME = "Emiliana";
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
