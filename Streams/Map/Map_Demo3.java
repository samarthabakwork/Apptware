package Streams.Map;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    int salary;

    public Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }


}
public class Map_Demo3 {
    public static void main(String args[]){
        List<Employee> list= Arrays.asList(new Employee(1,"abc",20000),
                                           new Employee(2,"def",30000));

        list.stream()
                .filter(e->e.salary>20000)
                .map(e->e.salary)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
