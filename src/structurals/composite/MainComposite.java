package structurals.composite;

/**
 *
 * @author janez
 */
public class MainComposite {

    private CompoundShape allShapes = new CompoundShape();

    public static void main(String[] args) {
        new MainComposite().loadAllShapes(
                new CompoundShape(new Dot(99, 84))
        );
    }

    void loadAllShapes(Shape... components) {
        allShapes.clear();
        allShapes.add(components);
        
        System.out.println(allShapes.getX());
    }

}
