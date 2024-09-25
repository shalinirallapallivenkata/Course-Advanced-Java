abstract class JustAnAbstract {
    public abstract void anonymousExample();
    // we do not implement abstract methods
    // we can create non abstract methods too
}

class Anonymousabstractclass {
    public static void main(String args[]) 
    {
        JustAnAbstract object = new JustAnAbstract()
        {
            public void anonymousExample()
            {
                System.out.println("Anonymous abstract class");
            }
        };
        object.anonymousExample();
    }
}