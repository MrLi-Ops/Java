package 实验三汽车租赁系统;

import java.util.Scanner;
public class Rental_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[4];
        cars[0]=new Car("Toyota","Camry","黑色",100);
        cars[1]=new Car("Honda","Civic","红色",80);
        cars[2]=new Car("Ford","Focus","银色",90);
        cars[3]=new Car("梅赛德斯","老李定制款","五彩斑斓的黑",99999);
        while (true){
            System.out.println("汽车租赁系统:");
            System.out.println("可租车辆");
            for (int i = 0; i < cars.length; i++){
                if(!cars[i].isRented()){
                    System.out.println(i+1+"."+cars[i].getBrand()
                        +" "+cars[i].getModel()+" "+cars[i].getColor()+" "+cars[i].getRentPrice()+"/天");
                }
            }
            System.out.println("输入你要租的车的编号（输入0退出）：");
            int carIndex = scanner.nextInt();
            if(carIndex==0){
                break;
            }
            if (carIndex < 1 || carIndex > cars.length){
                System.out.println("该车已租");
                continue;
            }
            System.out.println("输入你要租的天数");
            int rentalDays = scanner.nextInt();
            if(rentalDays <= 0){
                System.out.println("租赁天数不合法");
                continue;
            }
            Rental rental = new Rental(cars[carIndex - 1],rentalDays);
            double totalprice = rental.getTotalPrice();
            System.out.println("你租了一辆"+cars[carIndex-1].getColor()+" "+cars[carIndex-1].getModel()+"共"+rentalDays+"天");
            System.out.println("总租金:"+totalprice+"元");
            cars[carIndex-1].rent();
        }
        
    }    
}
