package HashMap_And_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_2094 {
    public static void main(String[] args) {
        Solution1 a= new Solution1();
        int[] arr={2,2,8,8,2};
        int[] res=a.findEvenNumbers(arr);
        print(res);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
class Solution1 {
    public int[] findEvenNumbers(int[] arr) {
    HashMap<Integer,Integer> map= new HashMap<>();
    List<Integer> ans = new ArrayList<>() ;

    int n= arr.length;
    for(int ele:arr){
        if(map.containsKey(ele)){
            int freq = map.get(ele);
            map.put(ele,freq+1);
        }
        else map.put(ele,1);
    }


    for(int i=100;i<=999;i+=2){
       int x=i;
       int c= x%10;x/=10;
        int b= x%10;x/=10;
        int a=x;
        if(map.containsKey(a)){
            int afreq = map.get(a);
            map.put(a,afreq-1);
            if(afreq==1) map.remove(a);
            if(map.containsKey(b)){
                int bfreq = map.get(b);
                map.put(b,bfreq-1);
                if(bfreq==1) map.remove(b);
                if(map.containsKey(c)){
                    ans.add(i);
                }
                map.put(b,bfreq);
            }
            map.put(a,afreq);
        }
    }
    int[] res=new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i]= ans.get(i);
        }
        return res;
    }
}
