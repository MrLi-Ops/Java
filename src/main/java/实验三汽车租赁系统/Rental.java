package 实验三汽车租赁系统;

public class Rental {
    private int rentalDays;
    private Car car;
    private double totalPrice;
    public Rental(Car car, int rentalDays) {
        this.car = car;
        this.rentalDays = rentalDays;
        this.totalPrice = rentalDays * car.getRentPrice();
        car.rent();
    }
    public int getRentalDays() {
        return rentalDays;
    }

    public Car getCar() {
        return car;

    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void returnCar() {
        car.returnCar();
    }
}