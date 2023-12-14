package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color,double width,double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void printInfo() {
        System.out.println(" Figure: rectangle, area: "
                + getArea() + " sq. units, width: " + width
                + " units, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}