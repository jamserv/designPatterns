package creational.bridge;

/**
 *
 * @author janez
 */
public abstract class AbstractFigura {
    IColor color;

    public AbstractFigura(IColor color) {
        this.color = color;
    }
    
    public abstract void draw();
}
