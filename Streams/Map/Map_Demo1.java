package Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Demo1 {
    public static void main(String args[]){
        List<String> products= Arrays.asList("Hp","Apple","Samsung");
        List<String> result=new ArrayList<>();

        result=products.stream().map(p->p.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
    }
}
