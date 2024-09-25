class Calc {
    public int add(int numOne, int numTwo) {
        return numOne + numTwo;
        }
        public int sub(int numOne, int numTwo) {
            return numOne - numTwo;
        }    
}

// public can be used anywhere
// lets say is not public and we try to access an int variable from other package 
// we get an error// mwans its default
// orivate variables/ access modifiers can only be accessed in
// that particular class where they are defined
// default means can be accessed in the same package
// protected ---> works in same package not in others
// protected can be accessed if a sub class
// one class is only public
//final - variable, method and class
// make value constant use final. variable when made final becomes constant
// final class -- the inheritence to be stopped so no class can extend the super class
// final class--> stopping inheritence -- cant be extended
// final method --- cannot override a final method.
// object  class will be called if not extending and printing the value gives hash
// toString() will be called while printing just object not object.
// we can change that toString()
// Downcasting and upcasting 
// A obj = (A) new B() ---> upcasting
//B obj1 = (B) obj( is object of A) ---> downcasting
// for every primitive type extends wrapper class 
// primitive type --? int char double etc.
// Integer is the class for int primitive type etc
// int num = 7;
// Integer num1 = new Integer(num)// 
// num primitive variable assigned to object boxing 
// Integer num1 = num // autoboxing
//num2 = num1.intValue(); // unboxing
// getting value from object value to other primitive value
// int num2 = num1 // auto-unboxing
// Integer.parseInt()// converts String to Integer
