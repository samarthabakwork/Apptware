package Streams.Filter;

import java.util.ArrayList;
import java.util.List;

public class Filter_Demo4 {

    public static void main(String args[]){
        List<Product> list=new ArrayList<>();
        list.add(new Product("HP",30000));
        list.add(new Product("Dell",40000));
        list.add(new Product("Acer",10000));
        list.add(new Product("Apple",5000));

        list.stream().filter(p->p.price>20000)
                .forEach(p->System.out.println(p.name+" "+p.price));
    }
}

class Product{
    String name;
    long price;

    public Product(String name,long price){
        this.name=name;
        this.price=price;
    }


}
