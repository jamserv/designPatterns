package structural.composite;

/**
 *
 * @author janez
 */
public abstract class BaseShape implements Shape {

    int x;
    int y;

    public BaseShape(int x, int y) {
        this.x = x;
        this.y = y;
    }        

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

}
