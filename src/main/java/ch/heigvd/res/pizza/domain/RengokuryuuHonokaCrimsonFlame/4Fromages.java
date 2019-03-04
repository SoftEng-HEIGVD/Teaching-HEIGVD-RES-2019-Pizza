package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class 4Fromages implements IProduct {

  public final static String NAME = "4 Fromages";
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
