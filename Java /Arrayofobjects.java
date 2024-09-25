class Student {
    String name;
    int id;
    int score;
}

class Arrayofobjects {
    public static void main(String args[]){
        // int nums[] = new int[4];
        // nums[0]= 4;
        // nums[1]= 234;
        // nums[2]= 43;
        // nums[3]= 1;
        // for(int i=0; i<nums.length;i++) {
        //     System.out.println(nums[i]);
        // }
        //object of Arrays

        Student studentOne = new Student();
        studentOne.name = "nameOne";
        studentOne.id = 1;
        studentOne.score = 90;

        Student studentTwo = new Student();
        studentTwo.name = "nameTwo";
        studentTwo.id = 2;
        studentTwo.score = 80;
        
        Student studentThree = new Student();
        studentThree.name = "nameThree";
        studentThree.id = 3;
        studentThree.score = 70;

        Student students[] = new Student[3];
        students[0]= studentOne;
        students[1]= studentTwo;
        students[2]=studentThree;
        
        // for(int i=0; i<students.length; i++){
        //     System.out.println(students[i].name + " " + students[i].score);
        // }
        for(Student student: students){
            System.out.println(student.name + " " + student.score);
        }
        //String created is an object of String class and they are immutable
        // String is immutable but for mutable we can use 
        //String buffer and String builder
        // use capacity for size of string buffer
        // string buffer object has methods to delete insert which cannot be done for String object
        // String buffer is thread safe and String builder isnt

    }
}