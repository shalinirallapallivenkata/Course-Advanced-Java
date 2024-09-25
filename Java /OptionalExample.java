import java.util.List;
import java.util.Arrays;
import java.util.Optional;


class OptionalExample {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("nameOne", "nameTwo", "nameThree", "nameThree");
        // no need of new keyword
        // Optional<String> name = names.stream()
        //                              .filter(n-> n.contains("x"))
        //                              .findFirst();
                                     // findfirst returns a value of Optional type
                                     // was introduced to get rid of null pointer exception
                                     // if the x is not contained in the list
                                     // we get null pointer exception
                                     // to get rid of that add Optional
        String name = names.stream()
                           .filter(n-> n.contains("x"))
                           .findFirst()
                           .orElse("name not found");
                           // remved Optional                                  
    //System.out.println(name.get());   
    // if doesnt have x  Optioanl exception
    //System.out.println(name.orElse("name not found"));        
        System.out.println(name);                    
    }

}