package CollectionFramework;

import java.util.Comparator;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Comparator {
    public static void main(String args[]){
        Map<Student,String> map=new TreeMap<>(new NameComparator());
        map.put(new Student(1,"Hitesh"),"Java");
        map.put(new Student(2,"Ajay"),"Python");

        for(Map.Entry<Student,String> entry:map.entrySet()){
            System.out.println(entry.getKey().getId()+" "+entry.getKey().getName()+": "+entry.getValue());
        }
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}
