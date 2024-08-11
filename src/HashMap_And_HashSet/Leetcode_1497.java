package HashMap_And_HashSet;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1497 {
    public static void main(String[] args) {

    }
}

class Solution4 {
    public boolean canArrange(int[] arr, int k) {
        int n= arr.length;
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            int ele=arr[i]%k;
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        for(int key: map.keySet()){
            int rem = k-key;
            if(!map.containsKey(rem)) return false;
            int keyfreq= map.get(key);
            int remfreq=map.get(rem);
            if(keyfreq !=remfreq) return false;
        }
return true;
    }
}