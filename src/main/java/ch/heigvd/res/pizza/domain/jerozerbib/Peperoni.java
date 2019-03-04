 package ch.heigvd.res.pizza.domain.jerozerbib;
 
 import ch.heigvd.res.pizza.domain.IProduct;
 
 import java.math.BigDecimal;
 
 public class Peperoni implements IProduct {
 
   public final static String NAME = "Peperoni";
   public final static BigDecimal PRICE = new BigDecimal(16.0);
 
   @Override
   public String getName() {
     return NAME;
   }
 
   @Override
   public BigDecimal getPrice() {
     return PRICE;
   }
 }
