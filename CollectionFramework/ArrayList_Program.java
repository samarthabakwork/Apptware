package CollectionFramework;


import java.util.ArrayList;
import java.util.List;

public class ArrayList_Program {
    public static void main(String args[]){
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("JAVA");
        list.add("java");
        list.add("Python");
        list.remove("Python");
        System.out.println(list);

        System.out.println("Python present: "+list.contains("Python"));
        System.out.println("size of list: "+list.size());
    }
}
