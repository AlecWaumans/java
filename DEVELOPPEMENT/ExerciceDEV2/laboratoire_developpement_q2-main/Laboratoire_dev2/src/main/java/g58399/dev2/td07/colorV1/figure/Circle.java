package g58399.dev2.td07.colorV1.figure;

/**
 *
 * @author alecw
 */
public class Circle extends Figure {

    protected final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
