//Compile time poly morphism or early binding
// Run time polymorphism or late binding
// over loading --- compile time poly morphism

class A {
    public void display () {
        System.out.println("A display method");
    }
}
class B extends A {
    public void display () {
        System.out.println("B display method");
    }
}
class C extends A {
    public void display () {
        System.out.println("B display method");
    }
}

class Polymorphism{
    public static void main(String args[]) {
        A object = new A(); // type is a object is A
        object.display();
        object = new B();// same type but different memory allocated at B and C
        object.display();
        object = new C();
        object.display();
    }
}