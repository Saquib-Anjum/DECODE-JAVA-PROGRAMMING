package Advance_Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={1,9,7,4,2,3,6,5,8};
        int n=arr.length;
        System.out.println("Array is ");
        print(arr);
        QuickSortArray(arr,0,n-1);
        System.out.println("After quick sort  ");
        print(arr);
    }
    //for printing the Array
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
        System.out.println();
    }
    //main thing for Quick sort here
    public static void QuickSortArray(int[] arr,int lo,int hi){
        //base case
        if(lo>=hi) return;
        //pivot arr[lo] ko sahi place per rakh kar aao
        //aur left part mein <= pivot
        int idx=partition(arr,lo,hi);
        //recursion
        QuickSortArray(arr,lo,idx-1);
        QuickSortArray(arr,idx+1,hi);
    }
    public static int partition(int[] arr,int lo,int hi){
        int pivot=arr[lo];
        int pivotIdx=lo;
        int smallerCount =0;
        for(int i=lo+1;i<hi;i++){
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = pivotIdx+smallerCount;
        swap(arr,pivotIdx,correctIdx);
        //partition
        int i=lo;
        int j=hi;
        while (i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);

            }
        }
        return correctIdx;
    }
    //for swap the function
    public static void swap(int[] arr,int i,int j) {
        if (i >= 0 && j >= 0 && i < arr.length && j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
