package 实验四智能图形设计师;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean fill, double borderWidth,double radius){
        super();
        this.radius = radius;
    }
    public double getArea() {
        this.area = Math.PI * radius * radius;
        return this.area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
