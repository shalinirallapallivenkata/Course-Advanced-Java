class NewCreatedException extends Exception {
    public NewCreatedException(String str) {
        super(str); // constructor of Exception class has string
        System.out.println(str);
        // super not calling exception constructor so using this
    }
}


class DefinedException {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;

        try {
            j= 18/i;
            System.out.println(j);
            if(j==0) {
                throw new NewCreatedException("Just an exception message");    
            }
        }
        catch(NewCreatedException e){
            System.out.println("Oops a defined exception");
        }
        catch(Exception e) {
            j=18/1;
            System.out.println("default j value just to display" + e);
        }

        try{
            Class.forName("ABC");
        }
        //checked exception
        catch (ClassNotFoundException e){
            System.out.println("Class Not found exception" + ":- This is a message" + ":" + e);

        }
    }
} 