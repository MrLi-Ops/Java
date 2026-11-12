package 实验三汽车租赁系统;

public class Car {
    private String brand;
    private String model;
    private String color;
    private double rentPrice;
    private boolean rented;
    public Car(String brand, String model, String color, double rentPrice) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.rentPrice = rentPrice;
        this.rented = false;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public double getRentPrice() {
        return rentPrice;
    }
    public boolean isRented() {
        return rented;
    }
    public void rent() {
        rented = true;
    }
    public void returnCar() {
        rented = false;
    }

}


