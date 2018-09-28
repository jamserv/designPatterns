package structurals.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author janez
 */
public class CompoundShape extends BaseShape {

    protected List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(0, 0);
        add(components);
    }

    public void add(Shape component) {
        children.add(component);
    }

    public void add(Shape... component) {
        children.addAll(Arrays.asList(component));
    }

    public void remove(Shape child) {
        int i = children.indexOf(child);
        children.remove(i);
    }

    public void remove(Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
        return children.get(0).getX();
    }
    
    

}
