package creational.builder;

import creational.builder.Product;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author janez
 */
public class BuilderTest {

    public BuilderTest() {
    }

    @Test
    public void init() {
        for (int index = 0; index < 10; index++) {
            Product product = new Product.ProductBuilder()
                    .id("id_" + index)
                    .name("product_" + index)
                    .price(new BigDecimal(32.15).setScale(2, RoundingMode.CEILING))                    
                    .build();

            System.out.println("product :: " + product);                       
            
            Assert.assertNotNull(product);            
            Assert.assertEquals("id_" + index, product.getId());
            Assert.assertEquals("product_" + index, product.getName());
            Assert.assertEquals(new BigDecimal(32.15).setScale(2, RoundingMode.CEILING), product.getPrice());            
            Assert.assertNull(product.getStock());
        }
    }

}
