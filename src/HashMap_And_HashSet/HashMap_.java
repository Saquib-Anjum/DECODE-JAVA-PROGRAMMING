package HashMap_And_HashSet;
import java.util.*;
public class HashMap_ {
    public static void main(String[] args) {
        //inserting values
        Map<String,Integer> map= new HashMap<>();
        map.put("Saquib",92);
        map.put("Vivek",112);
        map.put("Vishal",114);
        System.out.println(map);
        map.put("Harish Aman",34);
        map.put("Shahansha Anjum",67);
        map.put("Shaharyar Anjujm",78);
        map.put("Nigar",45);
        map.put("Afnan",120);
        System.out.println(map);
        System.out.println();
        System.out.println("Size");;
        System.out.println(map.size());
        //get Object
        System.out.println("Object key (get)");
        System.out.println(map.get("Vivek"));
        System.out.println("contains key");
        System.out.println(map.containsKey("Saquib"));
        System.out.println("containsValue");
        System.out.println(map.containsValue(78));
        System.out.println("remove object");
        map.remove("Afnan");
        System.out.println(map);
        System.out.println(map.size());

    }
}
