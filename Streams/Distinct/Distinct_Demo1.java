package Streams.Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_Demo1 {
    public static void main(String args[]){
        List<String> products= Arrays.asList("Hp","Hp","Hp","Apple","Samsung","Samsung");
        List<String> distinctProducts=products.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctProducts);
    }
}
