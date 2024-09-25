class ThrowsExample{
    public void throwExample() throws ClassNotFoundException{
        Class.forName("ABC");
    //     try{
    //         Class.forName("ABC");
    //     }
    //     //checked exception
    //     catch (ClassNotFoundException e){
    //         System.out.println("Class Not found exception" + ":- This is a message" + ":" + e);

    //     }
    // }
    // lets say no try catch use throws classNot found exception
    }

}


class Throw {
    static {
        System.out.println("Class Loaded");
    }
    // public static void main(String args[]) throws ClassNotFoundException{
    // dont use instead use try catch
    public static void main(String args[])  {
        ThrowsExample object = new ThrowsExample();
    try{
        object.throwExample();
    }
            //checked exception
    catch (ClassNotFoundException e){
            System.out.println("Class Not found exception" + ":- This is a message" + ":" + e);
            // e.printStackTrace();
        }
    
    }
}