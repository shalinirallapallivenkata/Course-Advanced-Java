import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;


class ParallelStreamExample {
    public static void main(String args[]) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        // array size of 10000
        // creating random number

        Random randomNumbers = new Random();
        //adding 100 more RANDON NUMBERS TO THE ArrayList
        // randomNumbers.nextInt(100);
        for(int i=1; i<=size;i++) {
            nums.add(randomNumbers.nextInt(100));
        }

        //System.out.println(nums);

        // int sumOne = nums.stream()
        //                  .map(n->n*2)
        //                  .reduce(0, (c,e)-> c+e);

        long startSeqOne = System.currentTimeMillis();
        int sumTwo = nums.stream()
                         .map(n->
                         {
                            //lets add thread.sleep
                            // thread needs excepgion handling
                            try {
                                Thread.sleep(1);
                            }
                            catch(Exception e) {

                            } return n*2;
                        })
                         .mapToInt(n->n) // sending the map multiplied by 2 values to maptoInt for sum
                         // lets say not int values returened 
                         .sum();
        long endSeqOne = System.currentTimeMillis();

        long startParallelSeq = System.currentTimeMillis();
        int sumThree = nums.parallelStream()
                           .map(n->{
                            try {
                                Thread.sleep(1);
                            }
                            catch(Exception e) {    
                            }
                            return n*2; 
                        })
                           .mapToInt(n->n)
                           .sum();
        long endParallelSeq = System.currentTimeMillis();
        // System.out.println(sumOne + ":" + sumTwo + ":" +sumThree);
        System.out.println(endSeqOne - startSeqOne);        
        System.out.println(endParallelSeq - startParallelSeq);  
        // parallel stream takes less time than sequence when adding wait         
    }
}