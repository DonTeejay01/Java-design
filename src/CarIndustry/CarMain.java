package CarIndustry;

public class CarMain {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.getCar("Audi");
        car1.drive();

        Car car2 = carFactory.getCar("BMW");
        car2.drive();

        Car car3 = carFactory.getCar("Benz");
        car3.drive();

    }
}

//class Cars {
//    public void drive(){
//        System.out.println("Driving a car!");
//    }
//}
