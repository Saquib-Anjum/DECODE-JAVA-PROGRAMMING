package BasicSorting;

public class Bubble_sort_decreasingOrder {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int n=arr.length;
        System.out.println("Array is   ");
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
        for (int k = 0; k < n; k++) {

            for (int i = 0; i < n-1; i++) {
                if(arr[i]<arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }

            }

        }
        System.out.println();
        System.out.println("Array is   ");
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
    }
}
