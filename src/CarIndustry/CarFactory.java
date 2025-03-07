package CarIndustry;

class CarFactory {
    public Car getCar(String carType) {
        if(carType==null){
            return null;
    }
    if(carType.equalsIgnoreCase("Audi")){
        return new Audi();
    }else if(carType.equalsIgnoreCase("BMW")){
        return new BMW();
    }else if(carType.equalsIgnoreCase("Benz")){
        return new Benz();
    }
    return null;
    }
}
