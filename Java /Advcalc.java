class Advcalc extends Calc{ // extends gets all properties of Calc class
    // in inheritence, if the java file Calc isnt there but .class file there
    // still the features of Calc come up
    // Advcalc is sub class and Calc is super class
    // child class Advclass parent class is Calc
    // base class is Calc and derived class is Advcalc 
    public int mult(int numOne, int numTwo) {
        return numOne * numTwo;
        }
        public int div(int numOne, int numTwo) {
            return numOne / numTwo;
        }    
}