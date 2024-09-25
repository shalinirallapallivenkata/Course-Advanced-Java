class Mobile {
    // private int price = 1500;
    // private String brand ="Yaffle";

    //Encapsulating the data to be used across the class to fetch the data using get and set

    public Mobile() { // constructor
        // default constructor no parameters
        // will be by default
        // when we create an object the constructor will be call
        // multiple objects created the below constructor will be called twice or thrice
        System.out.println("In default constructor");
        price = 2000;
        brand = "Yamsung";
        // for standards assign in constructor
        // db connection write the connection in constructior
    }

    public Mobile(int price, String brand) {
        System.out.println("Inparameterized constructor");
        this.price = price;
        this.brand = brand;
    }

    private int price;
    private String brand;
    

    public int getMobilePrice(){
        return price;
    }

    public String getMobileBrand(){
        return brand;
    }

    //public void setMobileBrand(String b){
    public void setMobileBrand(String brand){
        // to use the local and instance variable to be breand 
        // brand = brand wwe use this
        // Always local variables are given preference
        // we cab create an object of Mobile
        // Mobile obj = new Mobile
        // obj.brand  =brand // still doesnt work
        // the stack object in main assigns a pace for the address of age in heap
        // creating a new object creates a space in heap which doesnt point to the same address of the object in main
        // but has different address lets say object in mainhas address 101
        // address of new object in heap for the object new here is 103
        // to fix it we can pass the object and assign it to the new object created
        // Mobile obj = object;
        // object.brand = brand;
        // above lines of using the object can be reduced by using this keyword
        this.brand = brand;
    }

    public void setMobilePrice(int price){
        this.price = price;
    }
}

class Encapsulation {
    public static void main(String args[]){
        Mobile object = new Mobile();
        // constructor method overloading
        Mobile objectOne = new Mobile(800, "Fotorola");
        // creating new object with method overloading. We gotta create new constructor
        //accepting two parameters
        // lets say we need default values to the instance variables 
        System.out.println(object.getMobilePrice() + "" + object.getMobileBrand());
       System.out.println(objectOne.getMobilePrice() + "" + objectOne.getMobileBrand());
        
        // here we have values null
        // we can use constructor 
        // object.price= 100;
        //System.out.println(object.price);
        // will throw error as these variables are private
        object.setMobilePrice(1500);
        //object.setMobileBrand("Yaffle", object);
        object.setMobileBrand("Yaffle");

        // System.out.println(object.getMobileBrand() + "" + object.getMobilePrice());

        // class, interface -- starts with Capital letters
        // varibale and method - starts with non captal letters
        // constants all letters are constant
        // object is called a reference variable
        // new Mobile () and no Mobile object = new Mobile

        // new Mobile anonymous object
        //Cannot be used again


    }
}