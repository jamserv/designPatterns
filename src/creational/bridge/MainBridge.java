package creational.bridge;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author janez
 */
public class MainBridge {
    
    public static void main(String[] args) {
//        AbstractFigura figura = new Circle(new Rojo());
//        figura.draw();
//        figura.color = new Negro();
//        figura.draw();
//        
//        AbstractFigura figura2 = new Rectangle(new Negro());
//        figura2.draw();

            BigDecimal decimal = new BigDecimal("20.126");
            
            System.out.println(decimal.setScale(2, RoundingMode.FLOOR));
    }
}
