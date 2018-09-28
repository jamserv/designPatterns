package structurals.bridge;

/**
 *
 * @author janez
 */
public class MainBridge {

    public static void main(String[] args) {
        Shape shape = new Triangle(new RedColor());
        shape.applyColor();
        
        shape = new Pentagon(new GreenColor());
        shape.applyColor();
    }
}
