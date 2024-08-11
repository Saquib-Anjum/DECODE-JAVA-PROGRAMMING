package HashMap_And_HashSet;

import java.util.HashMap;
import java.util.Map;

public class Iterate_in_Map {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("Saquib",92);
        map.put("Vivek",112);
        map.put("Vishal",114);

        map.put("Harish Aman",34);
        map.put("Shahansha Anjum",67);
        map.put("Shaharyar Anjujm",78);
        for(String ele :map.keySet()){
            System.out.println(ele);
        }
        //just keys
        System.out.println();
        for(String ele :map.keySet()){
            int val=map.get(ele);
            System.out.println(ele+" "+val);
        }
        for(int ele :map.values()){
            System.out.println(ele);
        }
        for(Object pair :map.entrySet()){
            System.out.println(pair);
        }


    }
    
}
