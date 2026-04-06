package Streams.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(10,11,12,13,14,15,16,17,20,30);
        List<Integer> evenNumbers=new ArrayList<>();

       evenNumbers= list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
       System.out.println(evenNumbers);

    }
}
