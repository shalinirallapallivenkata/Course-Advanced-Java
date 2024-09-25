// types
// Interface : bstact and public
// Normal: two or more methods normal interface
// Functional interface (SAM): One one method: Saingle abstarct method
// Marker: No methods : blank interface: just to update the compiler
// For serialization: take object: varaibles a,b,c and with values
// We gotta save the data in hard drive we us for serialization and destroy the object
//to use the objects again after destroy :deserialization
@FunctionalInterface 
interface FuncInterface {
    void interfaceExample( int num);
}
// class FunctInt implements FuncInterface {
//     public void interfaceExample() {
//         System.out.println("Func interface example");
//     }
// }
// anonymous inner class


// lamda expression can only be used by functional interface


class FunInt{
    public static void main(String args[]) {
        // FuncInterface object = new FunctInt();
        // object.interfaceExample();
        // FuncInterface object = new FuncInterface() 
        // {
        //     public void interfaceExample() {
        //         System.out.println("Func interface example");
        //     }
        // };
        // lamda expression

        // FuncInterface object = (int num) -> System.out.println("Func interface example" + " " + num);
        
        // reduced further
        FuncInterface object = num -> System.out.println("Func interface example" + " " + num);

        // java 8 fetaurecompiler understands the brackets the methods etc.
        object.interfaceExample(26);
    }
    // with lamda expression no FunInt$1 anonymous class file is created
}
