// Every class in java extends Object class
// this executes the constructor of the same class
// super method executes constructor of super class
class A extends Object { // Default super class extends class Object
    public A() {
    super();    
    System.out.println( "In default constructor A");
    }
    public A(int n) {
        super();
        System.out.println( "In default constructor parameterized A");
    }
}
class B extends A { // Default super class extends class Object
    public B() {
        super(5);    // extends default constructor of A
        System.out.println( "In default constructor B");
    }
    public B(int n) {
        this();// call the default constructor of B
       //super(); // no need to specify calls the default constructor
        System.out.println( "In default constructor parameterized B");
            
    }        
}

class Super {
    public static void main(String args[]){
        //B object = new B();
       //B objectOne = new B(5);
       //B object = new B();
       B objectOne = new B(5);

    }
}