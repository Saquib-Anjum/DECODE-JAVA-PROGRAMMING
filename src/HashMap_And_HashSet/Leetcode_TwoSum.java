package HashMap_And_HashSet;

import java.util.HashMap;

public class Leetcode_TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        System.out.println("Array is ");
        print(nums);
        Solution sl= new Solution();
        int[]ans =sl.twoSum(nums,9);
        System.out.println("Answer");
        print(ans);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
//
        int[] ans ={-1,-1};
        int n= nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< n;i++){
         int rem = target-nums[i];
         if(map.containsKey(rem)){
             ans[0]=i;
             ans[1]=map.get(rem);
         }
         else{
             map.put(nums[i],i);
         }
        }
        return ans;


    }
}
