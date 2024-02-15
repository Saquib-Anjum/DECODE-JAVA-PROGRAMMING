package BasicSorting;

import org.w3c.dom.ls.LSOutput;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={3,-4,6,4,7,8,2,3};
        int n=arr.length;
        System.out.println("Array is ");
        print(arr);
        for (int i = 1; i <n ; i++) {
            for (int j = i; j >=1 ; j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr,j-1,j);
                }

            }
        }
        System.out.println();
        System.out.println("insertion sort  ");
        print(arr);
    }

    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+"  ");

        }
    }
    public static void swap(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

        }

}

