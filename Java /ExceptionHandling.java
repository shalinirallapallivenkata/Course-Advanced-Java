class ExceptionHandling {
    public static void main(String args[]) {
        int i =20;
        int j = 18;
        int nums[] = new int[5];
        String str = null;
        try{
            j = j/i;
            if (j == 0) {
                throw new ArithmeticException ("No message");
            }
            System.out.println(j);
            // if i = 0 only arthemetic exception
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            
        }
        // catch exceptions
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("oops default output" + ":" + j);
            // Exception is a class e is the object
            // The moment we get an error the try block the statement jumps to catch
            System.out.println("oops Arthemetic Exception" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            // Exception is a class e is the object
            // The moment we get an error the try block the statement jumps to catch
            System.out.println("oops Out of bounds Exception");
        }
        catch(Exception e) { // Parent class is at bttom
            // Arthimetic exception extends Runtime exception and exception extends throwable
            // able ---> is interfcaes but here throwable is class
            // that extends Exception
            // Error also extends throwable. Error comes stops execution
            // Eg: Thread death, IOerror, Vitual machine error and out of memory error
            // SQL exception and IOexception extends Runtime exception
            // Runtime exception unchecked exception
            // SQL exception, IOexcpetion and ()...etc checked exception
            // Throwable extends Object.
            System.out.println("oops" + e);

        }
        System.out.println(j + ":" + " " + "Exception handling example");
    }
}