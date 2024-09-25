import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
// class Student implements Comparable<Student> {
    int age;
    String name;
    //sort works with Integers
    // class can implement comparable or use comparator

    public Student(int age, String name) {
        this.age=age;
        this.name=name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // public int compareTo(Student that) {
    //     if(this.age > that.age) 
    //         return 1; // 1 if swap -1 if not
    //     else 
    //         return -1;
    // }
}

class ComparatorComparableExample {
    public static void main(String args[]) {

        //Comparator<Integer> com = new Comparator<Integer>() 
        // Since comparator i of Student now
        // Comparator<Student> com = new Comparator<Student>() 
        // comparator is a functional Interface
        // {
        // public int compare(Integer i, Integer j) {
        //     if(i%10 > j%10)
        //         return 1; // 1 if swap -1 if not
        //     else 
        //         return -1;
        // }
        // public int compare(Student i, Student j) {
        //     if(i.age > j.age)
        //         return 1; // 1 if swap -1 if not
        //     else 
        //         return -1;
        // }
    // };
    Comparator<Student> com = (i,j) -> i.age > j.age ? 1 : -1 ;


        // List<Integer> nums = new ArrayList<>();
        // nums.add(42);
        // nums.add(15);
        // nums.add(71);
        // nums.add(29);
        // nums.add(50);

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(42, "studentOne"));
        nums.add(new Student (15,"studentTwo"));
        nums.add(new Student (71, "studentThree"));
        nums.add(new Student (29, "studentFour"));
        nums.add(new Student (50, "studentFive"));


        Collections.sort(nums, com); // Collections is a class
        //w/o comm
        // Collections.sort(nums);
        for(Student s : nums) {
            System.out.println(s);
        }


    }
}