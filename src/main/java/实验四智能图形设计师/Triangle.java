package 实验四智能图形设计师;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, boolean fill, double borderWidth, double a, double b, double c) {
        super(color, fill, borderWidth);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // 计算面积方法（海伦公式）
    public double getArea() {
        double s = (a + b + c) / 2.0;
        this.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return this.area;
    }

    // Getter & Setter
    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public double getB() { return b; }
    public void setB(double b) { this.b = b; }

    public double getC() { return c; }
    public void setC(double c) { this.c = c; }

}
