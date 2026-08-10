package lamda_01.StreamQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class S1 
{
 public static void main(String[] args) 
 {
    //find the all number greater than 25 using filter
    List<Integer>numbers=Arrays.asList(5,2,10,45,33,77,54,20,15,2,4); 
    List<Integer> greaterNumber=numbers.stream().filter(n->n>20).collect(Collectors.toList());

    //Find the first number greater than 25.
    int firtNumber=numbers.stream()
    .filter(number->number>25).findFirst().orElse(null);
    System.out.println("First number:"+firtNumber); 

    //Find the second highest distinct number
    int seconddistnictmax=numbers.stream().distinct()
    .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    

 }   
}
