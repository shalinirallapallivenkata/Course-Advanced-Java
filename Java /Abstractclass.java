// Cant create an objedct ofr abstract class
// we can create an instance of abstract class
// It is not manadatory to have an abstract method in abstract class
// there can be multiple abstract methods in abstract class;

abstract class Car {
    public abstract void drive();
    public abstract void repair();
    public void brake () {
        System.out.println("Brakes applied");
    }
} 
abstract class ModelOne extends Car {
    public void drive() { // implementing abstract method in this class
        System.out.println("Driving");
    }
}
// Implementing another method in other class from abstract class Car
class Repairs extends ModelOne { // concret class
    public void repair() {
        System.out.println("Repairs");
    }
}
class Astractclass {
    public static void main(String args[]){
        Car object = new Repairs();
        object.brake();
        object.repair();
        object.drive();
    }
}