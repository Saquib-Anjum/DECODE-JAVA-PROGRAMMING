package Advance_Sorting;

public class InversionCount {
    static int count=0;
    public static void main(String[] args) {
        int[] arr = {80, 45, 67, 23, 54, 59, 34};
        print(arr);
        mergeSort(arr);
        System.out.println();
        System.out.println("After merge sort Array is ");
        print(arr);
        System.out.println();
        System.out.println("Inversion count is    ");
        System.out.println(count);
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        //base case
        if(n==1) return;
        //divide and copy
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        //divide and copy
        for (int i = 0; i < n - n / 2; i++) {
            b[i] = arr[i + n / 2];

        }
        //sending for recursion
        mergeSort(a);
        //sending for recursion
        mergeSort(b);
        //inversion
        inversionCount(a,b);
        //merging two sorted array
        mergeTwoSortedArray(a, b, arr);


    }

    public static void mergeTwoSortedArray(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            }
            else c[k++]=b[j++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        while (i<a.length){
            c[k++]=a[i++];
        }
    }
    public static void inversionCount(int[]a,int[] b){
        int i=0;
        int j=0;

        while (i < a.length && j < b.length){
            if(a[i]>b[j]){
                count+=(a.length-i);
                j++;

            }
            else i++;

        }

    }
}