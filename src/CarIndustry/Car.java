package CarIndustry;

interface Car {
    void drive();
}

class BMW implements Car {
    public void drive() {
        System.out.println("BMW driving");
    }
}
class Audi implements Car {
    public void drive() {
        System.out.println("Audi driving");
    }
}
class Benz implements Car {
    public void drive() {
        System.out.println("Benz driving");
    }
}