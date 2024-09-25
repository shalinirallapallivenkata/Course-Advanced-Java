import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
class CollectionsExample {
    public static void main(String args[]) {
        // CollectionAPI
        // Collection is an interface
        // Collections is a class
        //Collection<Integer> nums = new ArrayList<Integer>();
        // use Generics <> to provide the type of the collection
        //Collection nums when adding an element treats it as an object

        //List<Integer> nums = new ArrayList<Integer>();
        //Changing it to List

        // Set Supports unique values
       //Set<Integer> nums = new HashSet<Integer>();

        //Use TreeSet for sorted Set
        // Set<Integer> nums = new TreeSet<Integer>();
        // Set, Queue come from Collections which is a collections framework

        Map<String, Integer> nums = new HashMap<String, Integer> ();
        // Use hash table while using threads that need to be synchronized
        nums.put("numberOne", 23);
        nums.put("numberTwo", 21);
        nums.put("numberThree", 22);
        nums.put("numberFour", 27);
        nums.put("numberFive", 26);
        nums.put("numberOne", 23);
        //Same key cannot be repated
        //System.out.println(nums);
        System.out.println(nums.keySet());
        for(String key: nums.keySet()) {
            System.out.println(key + ":" + nums.get(key));
        }


        // nums.add(24);
        // nums.add(23);
        // nums.add(22);
        // nums.add(21);
        // nums.add(21);
        // nums.add(24);
        // nums.add(22);
        // doesn't comes in sorted format
        //set doesnt support index value

        // for( int n : nums) {
        //     System.out.println(n);
        // }
        //     // --> Iterable --> Collection Interface ---> Classes : List, Set, HashSet etc.
        //     Iterator<Integer> values = nums.iterator();
        //     System.out.println("Set example");
        //     while(values.hasNext()){
        //         System.out.println(values.next());
        //     }
    }
}