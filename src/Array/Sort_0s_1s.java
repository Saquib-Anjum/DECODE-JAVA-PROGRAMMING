package Array;

public class Sort_0s_1s {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,0,0,1,0,1,0,1,0,1,0,1,1,1,1,0,0,0,1,0,0,0,0,1,1,1,0,1,0,1,0,1,0,1,0};
        int n= arr.length;
        System.out.println(n);
        System.out.println("Array");
        for( int ele:arr){
            System.out.print(ele+" ");
        }
        int numbers_of_1s= 0;
        int numbers_of_0s=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=1){
                numbers_of_1s++;
            }
            if(arr[i]==0){
                numbers_of_0s++;
            }
        }
        System.out.println();
        System.out.println("Number of Ones   "+numbers_of_1s);
        System.out.println("Number of Zeros   "+numbers_of_0s);




        for (int i = 0; i <n ; i++) {

            if(i<numbers_of_0s) arr[i]=0;
            else
                arr[i]=1;

        }
        System.out.println();
        System.out.println("sorted array  ");
        for( int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
