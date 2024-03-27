package Advance_Sorting;

public class TwoSortingArray {
    public static void main(String[] args) {
        int[] a = {10, 30, 60, 80, 90};
        int[] b = {21, 42, 72, 78};
        int[] c = new int[(a.length + b.length)];
        System.out.println("Arra a is");
        print(a);
        System.out.println("Array  b is  ");
        print(b);
        System.out.println("two sorted Array is   ");
        print(merge(a, b, c));

    }

    public static void print(int[] arr) {
        //System.out.println("Array is  ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }

            k++;
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                k++;
            }
        }
        if (j== b.length) {
            while (i <a.length) {
                c[k] = a[i];
                i++;
                k++;

            }
        }

return c;
    }
}

