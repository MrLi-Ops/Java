package 实验四智能图形设计师;

public class ShapeManager {
    private Shape[] shapes;

    public ShapeManager(int size) {
        shapes = new Shape[size];
    }

    public void addShape(Shape shape, int index) {
        shapes[index] = shape;
    }

    // 原有的计算总面积方法
    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            if (shape != null) {
                totalArea += shape.getArea();
            }
        }
        return totalArea;
    }

    public void display() {
        System.out.println("===== 所有图形信息 =====");
        for (int i = 0; i < shapes.length; i++) {
            // 只有当该位置有图形时才打印
            if (shapes[i] != null) {
                Shape s = shapes[i];
                s.getArea(); // 确保面积是最新的
                System.out.println("图形[" + i + "] | 类型: " + s.getClass().getSimpleName()
                        + " | 颜色: " + s.getColor()
                        + " | 填充: " + s.getFill()
                        + " | 面积: " + s.getArea());
            }
        }

    }

    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager(5);
        Shape rect = new Rectangle("红色", true, 2.0, 5.0, 3.0);
        Shape circle = new Circle("蓝色", false, 1.5, 4.0);
        Shape tri = new Triangle("绿色", true, 1.0, 3.0, 4.0, 5.0);
        manager.addShape(rect, 0);
        manager.addShape(circle, 1);
        manager.addShape(tri, 2);
        manager.display();
        System.out.println("总面积: " + manager.getTotalArea());
        System.out.println("\n计算老李的体表面积:");
        People people = new People("李春雨", "2026105207", 167, 80);
        people.printInfo();



    }
}