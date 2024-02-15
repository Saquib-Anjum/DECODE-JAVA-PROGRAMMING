package BasicSorting;

public class question {
    public static void main(String[] args) {
        /*
        Q. Given an array with N distinct elements, convert the given array to a form where all elements are in the
range from 0 to N-1. The order of elements is the same, i.e., 0 is placed in the place of the smallest element, 1 is
placed for the second_smallest element, … N-1 is placed for the largest element.
            Input: arr[] = {10, 40, 20}
            Output: arr[] = {0, 2, 1 */

        int [] arr={40,12,78,34,100,57,23};
        int n=arr.length;
        System.out.println("Array is   ");
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
        int x=0;
        for (int i = 0; i < n; i++) {
            int min=Integer.MAX_VALUE;
            int minidx=-1;
            for (int j = 0; j < n; j++) {
                if(arr[j]<min  &&  arr[j]>0){
                    min=arr[j];
                    minidx=j;

                }

            }
            arr[minidx]=x;
            x--;

        }
        System.out.println();
        System.out.println("  final  Array is   ");
        for(int ele:arr){
            System.out.print(ele+"  ");

        }
        for (int i = 0; i < n; i++) {
            arr[i]*=(-1);

        }

        System.out.println();
        for(int ele:arr) {
            System.out.print(ele + "  ");

        }
        }
}
