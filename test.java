import java.util.*;

public class test{

   public static void main(String[] args){

       int target=9;

       int[] numbers={2,7,11,13};

       int[] indices=twoSum(numbers, target);

       System.out.println("The first index is "+indices[0]+"; the second index is "+indices[1]+".");

   } 


   public static int[] twoSum(int[] numbers, int target){

       // Initialize
       int[] indices=new int[2];
    
       // Construct a hash table
       Hashtable<Integer, Integer> Dict=new Hashtable<Integer, Integer>();

       // put the number and its index into the Hashtable
       for (int i=0; i<numbers.length; ++i){
           Dict.put(numbers[i], i);
       }

       // search
       for (int i=0; i<numbers.length; ++i){
           
            // obtain the Integer
            Integer p=Dict.get(target-numbers[i]);

            // if p exists and p is greater than i
            if (p !=null && p>i){
               indices[0]=i+1;
               indices[1]=p+1;
            }
       }

       return indices;

    }

   
}
