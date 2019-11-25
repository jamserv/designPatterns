package creational.builder;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author janez
 */
public class RunBuilder {

    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            Product product = new Product.ProductBuilder()
                .id("id_" + index)
                .name("product_" + index)
                .price(new BigDecimal(32.15).setScale(2, RoundingMode.CEILING))
                //.stock(new Double(index))
                .build();
            
            System.out.println("product :: " + product);
        }                
    }
}
