package 实验四智能图形设计师;

public class People {
    private String name;
    private String studentId;
    private double height;
    private double weight;

    // 用于存储计算好的人体体表面积
    private double surfaceArea;

    public People(String name, String studentId, double height, double weight) {
        this.name = name;
        this.studentId = studentId;
        this.surfaceArea = Math.sqrt(height * weight / 3600.0);
    }


    public void printInfo() {
        System.out.printf("姓名: %s | 学号: %s | 人体体表面积: %.4f 平方米\n",
                name, studentId, surfaceArea);
    }

    // ============ Getters 和 Setters ============

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}