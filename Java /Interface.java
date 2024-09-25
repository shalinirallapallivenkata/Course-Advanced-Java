interface Example {
    // variables in an interface are final and static
    int age = 200;
    String brand ="Yaffle"; // final and static
    // values since final cannot be changed
    // but can be used across the class using the class name. No need for object
    // methods in an interface are public and abstract we do not need 
    // to explicitly metion
    void exampleOne();
    void exampleTwo();
}

interface ExampleOne extends Example {
    void exampleThree();
}

interface ExampleTwo {

}

// another implementation of the methods can be some in a class using
// implements keyword

class InterfaceExample implements Example, ExampleOne{
    public void exampleOne() {
        System.out.println("Anonymous interface example one");
    }
    public void exampleTwo() {
        System.out.println("Anonymous interface example two");
    }
    public void exampleThree() {
        System.out.println("Anonymous interface example three");
    }
}

class Interface {
    public static void main(String args[]) {
        Example object; // can be defined
        // but gotta create object of implementation class
        object = new InterfaceExample();
        object.exampleOne();
        object.exampleTwo();
        System.out.println(Example.age + "" + '\n' + "" + Example.brand);
        ExampleOne objectOne = new InterfaceExample();
        objectOne.exampleThree();

    }
}
// multiple interfaces can be implemented by a single class
// interface to interface we use extends