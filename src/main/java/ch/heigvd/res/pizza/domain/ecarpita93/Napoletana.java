package ch.heigvd.res.pizza.domain.ecarpita93;

        import ch.heigvd.res.pizza.domain.IProduct;

        import java.math.BigDecimal;

public class Napoletana implements IProduct {

    public final static String NAME = "Napoletana";
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
