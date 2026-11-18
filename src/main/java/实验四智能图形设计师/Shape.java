package 实验四智能图形设计师;

public class Shape {
    protected String color;
    protected boolean fill;
    protected double borderWidth;
    protected double area;

    public Shape() {}
    public Shape(String color, boolean fill, double borderWidth) {
        this.color = color;
        this.fill = fill;
        this.borderWidth = borderWidth;
    }

    // 获取和设置属性的方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public boolean getFill() {
        return fill;
    }

    public void isFill(boolean fill) {
        this.fill = fill;
    }

    public double getArea() { return area; }
}