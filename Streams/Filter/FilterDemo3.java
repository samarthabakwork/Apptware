package Streams.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterDemo3 {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(10,null,20,null,30,null,40);
        list.stream().filter(num->num!=null).forEach(System.out::println);
    }
}
