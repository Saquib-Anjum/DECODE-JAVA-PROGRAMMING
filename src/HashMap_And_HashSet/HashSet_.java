package HashMap_And_HashSet;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(29);
        set.add(10);
        set.add(23);
        set.add(100);
        set.add(29);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.remove(29));
        //search
        System.out.println(set.contains(50));
        System.out.println(set);
    }
}
