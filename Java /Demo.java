 class Overload{
    public int add( int a, int b, int c) {
        return a+b+c;
    }
    public int add(int a, int b) {
        return a+b;
    }
    public double add(double a, int b){
        return a+b;
    }

 }
 public class Demo 
 {
    public static void main(String a[]){
        Overload object = new Overload();
        //Method overloading
        System.out.println(object.add(1,2,3));
        System.out.println(object.add(1,2));

    }
    // memory allocated in JVM is in stack n heap
    //every method has its own stack
    // heap memory is where we have class variables and objects
    //i.e: reference variable
    //local variables and methods part of stack like main method
    // instance variables part of heap
    // obj.add execution starts from stack.
    // this stack holds the reference or address in the heap

    int num[] = {3,4,5};
    // dnno values
    int num1[] = new int[4];
    // all values for num1 is 0;
    // array of array 
    // nums[][]= new int[3][4];
 }