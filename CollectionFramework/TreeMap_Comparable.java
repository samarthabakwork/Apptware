package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Comparable {
    public static void main(String args[]){
        Map<Student,String> map=new TreeMap<>();
        map.put(new Student(10,"Hitesh"),"Java");
        map.put(new Student (2,"Ramesh"),"Python");

        for(Map.Entry<Student,String> entry:map.entrySet()){
            System.out.println(entry.getKey().getId()+": "+entry.getValue());
        }
    }
}

class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student s1){
        return this.id-s1.id;
    }
}
