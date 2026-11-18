package 实验四智能图形设计师;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean fill, double borderWidth, double width, double height) {
        super(color, fill, borderWidth);
        this.width = width;
        this.height = height;
    }

    // 计算面积方法
    public double getArea() {
        this.area = width * height;
        return this.area;
    }

    // Getter & Setter
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
}
