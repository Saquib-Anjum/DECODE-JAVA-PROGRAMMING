package Array;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        System.out.println("array is   ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(  "reverse is  ");
        for (int i = 0; i <arr.length ; i++) {
//reverse
            int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            if(arr[i]>arr[j]) break;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
