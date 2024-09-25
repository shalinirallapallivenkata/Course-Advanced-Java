interface Computer {
    void code ();
}

class Desktop implements Computer  {
    public void code() {
        System.out.println("Coding");
    }

}

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding");
    }
}
class Developer {
    public void develop(Computer object) {
        object.code();
    }
}


class NeedForInterface {
    public static void main(String args[]) {
        Computer objectOne = new Laptop();
        Computer objectTwo = new Desktop();
        Developer object = new Developer();
        object.develop(objectOne);
    }

}