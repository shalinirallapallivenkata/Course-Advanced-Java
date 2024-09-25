
enum Status {
    Compiling, Failed, Pending, Success;
    // basically objects and status is a class
    // named constants
    // enum extends Enum class
}

class Enum {
    public static void main(String args[]) {
        Status s = Status.Failed;
        System.out.println(s);
        // sttaus has number 
        // use ordinal
        System.out.println(s.ordinal());
        // to get all status
        Status[] status = Status.values();

        for( Status stat: status) 
        {
        System.out.println(stat);
        }
        System.out.println(s.getClass().getSuperclass());

        // for if else 
        // Status s = Status.Running
        // use s == Status.Running || Status.Failed etc
        // For Switch
        // switch(s)
        // in case we dont need Status.Compiling we can use constant itselg
        // like case (Compiling) do something and  break;
        // case(Failed) do something and  break;
        // wnums with switch looks good

    }

}