package Streams.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String args[]){
        List<String> list= Arrays.asList("abcdedf","abcdefgh","abcdefghi","abc","abcdefghij","ab","dfgqwer");
        List<String> result=new ArrayList<>();
        result=list.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
        System.out.println(result);

    }
}
