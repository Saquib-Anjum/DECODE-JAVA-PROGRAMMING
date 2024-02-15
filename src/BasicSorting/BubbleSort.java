package BasicSorting;

public class BubbleSort {
    public static void print(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={8,7,5};
        int n= arr.length;
        System.out.println("Array is  ");
        print(arr);
//bubble sort
        for (int k = 0; k<n-1; k++) {
            for (int i = 0; i < n-1-k; i++) {
                if(arr[i]>arr[i+1]){
                    //swap(i,arr);
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }

            }

        }



        //optimised bubble sort

        for (int k = 0; k<n-1; k++) {
            boolean flag= true;
            for (int i = 0; i < n-1-k; i++) {
                if(arr[i]>arr[i+1]){
                    //swap(i,arr);
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;


                }
    
            }
            if(flag==true) break;
            }

        System.out.println();
        System.out.println("sorted array");
        print(arr);
    }



}
