class Calc {
    public int add(int numOne, int numTwo) {
        return numOne + numTwo;
        }   
}

class Advalc {
    public int add(int numOne, int numTwo) {
        return numOne + numTwo + 10;
        }   
}

class Override {
    public static void main(String args[]) {
        Advalc object = new Advalc();
        System.out.println(object.add(2,3));
        // overrideing the add of super class in sub class
        // .* to import classes from the package only imports all files not folders
        // for the other folders we need to mention it
    }
}