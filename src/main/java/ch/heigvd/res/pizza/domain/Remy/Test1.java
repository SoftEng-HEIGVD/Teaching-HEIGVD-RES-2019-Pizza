package ch.heigvd.res.pizza.domain.Remy;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Test1 implements IProduct {

  public final static String NAME = "test1";
  public final static BigDecimal PRICE = new BigDecimal(666.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
