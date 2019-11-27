package structural.composite;

/**
 *
 * @author janez
 */
public class MainComposite {

    private CompoundShape allShapes = new CompoundShape();

    public static void main(String[] args) {
        new MainComposite().loadAllShapes(
                new CompoundShape(new Dot(98, 84)),
                new Dot(65, 45)
        );
    }

    void loadAllShapes(Shape... components) {
        allShapes.clear();
        allShapes.add(components);
        
        System.out.println(allShapes.getX());
    }

}
