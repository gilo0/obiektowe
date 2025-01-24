public class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors){
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public String getBrand(){
        return brand;
    }

    public static void main(String[] args) {
        Car volvo = new Car("volvo", "karawan", 9);
        System.out.println(volvo.getBrand());

    }
}
