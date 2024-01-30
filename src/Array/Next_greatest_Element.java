package Array;

public class Next_greatest_Element {
    public static void main(String[] args) {
        int[] arr={43,23,56,67,54,23,45,54,89,34,43,12,11,22,2,3,1};
        System.out.println("Array  ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        int n= arr.length;
        int[] ans = new int[n];
        ans[n-1]=-1;

        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            for (int j = i+1; j <n ; j++) {
                max=Math.max(arr[j],max);

            }
            ans[i]=max;
        }

        System.out.println();
        System.out.println("Answer");
       for(int ele:ans){
           System.out.print(ele+" ");
       }
    }
}
