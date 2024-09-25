class Mobile {
    String brand;
    int price;
    static String type; // these inside a class reference variable

    // use constructor to initiliaze the reference variables of the class 

    public Mobile() {
        //initialize the reference variables onjects in main when call loads these
        // however since type is static we use static block to not initialize it again n again
        brand="";
        price=100;
    }

    static {
        type="Phone";
    }

    public void display() {
        System.out.println(brand + " " + price + " " + type );
    }

    public static void displayOne(Mobile objectOne, Mobile objectTwo){
        System.out.println("new line");
        System.out.println(objectOne.brand + " " + objectOne.price + " " + type );
        System.out.println(objectTwo.brand + " " + objectTwo.price + " " + type );
    }
    //When we try to call a static method by the mobile class since static variables and methods are available across all objects
    // since the brand and price are non static we get compilation errors
    // type however, works fine as it is a static variable
    // Thus to access the non non sttaic variables in a static method we need to pass the object/ reference of the Mobile class

    // variable inside a method local variable
}

class Staticexample {
    public static void main(String args[]){
        Mobile objectOne = new Mobile();
        objectOne.brand = "Yaffle";
        objectOne.price = 1500;
        Mobile.type = "Mobile device";

        Mobile objectTwo = new Mobile();
        // objectTwo.brand = "Fuixel";
        // objectTwo.price = 800;
        // Mobile.type = "Mobile device";

        objectOne.type = "Mobile Phone";

        objectOne.display();
        objectTwo.display();
        
        Mobile.displayOne(objectOne, objectTwo);

        // lets say we want all the type of the mobile devices to change to Phone
        // Declare reference variable to be static making it common to all the objects created in the main method
        // Static varibales should be called with class 
        // Eg: LEts say type is static change the reference to be called by class and not the object since it is commonly shared among the objects
        // non static methods can use static variables

        //if not object created ande lets say all the above are commented for Mobile class to be called
        // use Class..forName(// give name of class
        //Class.forName("Mobile") wil load the class
        // ust instantiates the Mobile class
    }
}