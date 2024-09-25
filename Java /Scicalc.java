class Scicalc extends Advcalc {
    // AdvCalc extends Calc so we get all methods
    // Calc--> Advcalc-->Scical ---> multilevel inheritence
    // Scical and AdvCal is single level inheritence
    // Scicalc extends Advcalc, Calc wont work
    // or neither Scicalc exstends Advcalc extends Calc wont work  
    // java multiple inheritence doenst work
    // super() means call the constructor ( default one) of super class
    // every class has a super() method

    public double power(int numOne, int numTwo) {
        return Math.pow(numOne , numTwo);
    }
}