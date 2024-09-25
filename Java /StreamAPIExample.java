import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamAPIExample {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        // stream can only be used once
        // Stream<Integer> streamOne = nums.stream();
        // Stream<Integer> streamTwo = streamOne.filter(n->n%2==0);
        // Stream<Integer> streamThree = streamTwo.map(n->n*2);
        // int result = streamThree.reduce(0, (c,e) -> c+e);

        //nums.forEach(n -> System.out.println(n));
        //streamOne.forEach(n -> System.out.println(n));
        //streamTwo.forEach(n -> System.out.println(n));
        // streamThree.forEach(n-> System.out.println(n));
       // System.out.println(result);

       int result = nums.stream()
                .filter(n-> n%2 ==0 ) // taqkes predicate type object 
                // and returns boolean test method
                // basically Predicate<Integer> p = the above expression 
                .map(n -> n*2)
                // Function similary is as predicate appply ,ethod
                .reduce(0, (c,e)-> c+e);
                System.out.println(result);  
                // used sorted on Stream to get soreted values      
    }
}