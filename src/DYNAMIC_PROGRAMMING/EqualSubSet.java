package DYNAMIC_PROGRAMMING;

public class EqualSubSet {
    public static void main(String[] args) {
       int[] arr = {8,1,2,4,3,6};
       int target = 25;
       System.out.println(subset(0,0,arr,target));
    }

    private static boolean subset(int i, int sum, int[] arr, int target) {
        if(i==arr.length){
            if(sum==target) return true;
            else return false;

        }
        boolean pick = subset(i+1,arr[i]+sum,arr,target);
        boolean skip = subset(i+1,sum,arr,target);
        return pick || skip;
    }
}
