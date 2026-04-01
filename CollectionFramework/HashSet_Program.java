package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Program {
    public static void main(String args[]){
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(10);
        set.add(9);
        set.add(8);
        set.add(1);
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
