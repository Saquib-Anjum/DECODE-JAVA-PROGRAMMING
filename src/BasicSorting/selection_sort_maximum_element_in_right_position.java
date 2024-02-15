package BasicSorting;

public class selection_sort_maximum_element_in_right_position {
    public static void main(String[] args) {
        int[] arr={10,-4,20,1,-6,8};
        int n=arr.length;
        System.out.println("Array is  ");
        print(arr);
        for (int i = 0; i <n-1 ; i++) {
            int max=Integer.MIN_VALUE;
            int minidx=-1;
            for (int j = i; j <n ; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    minidx=j;

                }

            }
            swap(arr,i,minidx);

        }
        System.out.println();
        System.out.println("after selection sort decreasing order ");
        print(arr);
    }

    public static void print(int[] arr) {

        for(int ele:arr){
            System.out.print(ele+"  ");
        }
    }

    public static void swap(int[] arr,int i,int j) {

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
