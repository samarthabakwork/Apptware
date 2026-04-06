package Streams.Map;

import java.util.Arrays;
import java.util.List;

public class Map_Demo2 {
    public static void main(String args[]){
        List<String> products= Arrays.asList("Hp","Samsung","Apple");

        products.stream().map(p->p.length()).forEach(System.out::println);
    }
}
