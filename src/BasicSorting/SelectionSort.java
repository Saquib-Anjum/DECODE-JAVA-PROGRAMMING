package BasicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={10,-4,20,1,-6,8};
        int n=arr.length;
        System.out.println("Array is  ");
        print(arr);
        for (int i = 0; i <n-1 ; i++) {
            int min=Integer.MAX_VALUE;
            int minidx=-1;
            for (int j = i; j <n ; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    minidx=j;

                }

            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;

        }
        System.out.println();
        System.out.println("after selection sort");
        print(arr);
    }

    public static void print(int[] arr) {

        for(int ele:arr){
            System.out.print(ele+"  ");
        }

    }
}
