package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Program {
    public static void main(String args[]){
        Map<Character,Integer> map=new HashMap<>();
        String name="COCCACOLA";
        for(int i=0;i<name.length();i++){
            if(!map.containsKey(name.charAt(i))) {
                map.put(name.charAt(i), 1);
            }
            else {
                map.put(name.charAt(i),map.get(name.charAt(i))+1);
            }
        }

        System.out.println("Character Frequencies : ");
        for(char key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
}
