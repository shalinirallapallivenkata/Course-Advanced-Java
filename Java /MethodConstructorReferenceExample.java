import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


class Student {
    private int age;
    private String name;

    public Student() {

    }

    public Student(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
     
    public void setName(String name) {
        this.name=name;
    }

    public String toString() {
        return "age=" + age + "name=" +name;
    }

}
class MethodConstructorReferenceExample {
    public static void main(String args[]) {
        // List<String> names = Arrays.asList("nameOne", "nameTwo", "nameThree", "nameFour");
        // List<String> capsNames = names.stream()
                                      // .map(n->n.toUpperCase())
                                      //can be replaced as method reference as below
                                      //.map(String::toUpperCase)
                                      // only mention method name not brackets
                                      //For every single value of String type needs to be converted to upper class
                                      //.toList();
        
        //capsNames.forEach(name -> System.out.println(name));
        // capsNames.forEach(System.out :: println);
        // can be changed to method reference as below
        List<String> names = Arrays.asList("nameOne", "nameTwo", "nameThree", "nameFour");
        // create a list of object of students
        List<Student> students = new ArrayList<>();

        // for(String name: names) {
        //     students.add(new Student(name));
        // }

        // System.out.println(students);

        //Now in Stream API

        students = names.stream()
                        // .map(n -> new Student(n))
                        // can be changed to constructor reference as below
                        .map(Student :: new)
                        .toList();
        System.out.println(students);                

    }
    
}