package Array;

public class sort_0s_1s_2s_ {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,1,2,0,0,2,1,1,2,0,0,1,1,2,0};
        System.out.println("Array is    " );
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        int n = arr.length;
        int noOFZeroes= 0;
        int noOFOnes =0;
        for (int i = 0; i <n ; i++) {

            if(arr[i]==0) noOFZeroes++;
            if(arr[i]==1) noOFOnes++;


        }

        for (int i = 0; i < n; i++) {

            if(i<noOFZeroes)  arr[i]  = 0;
            else if(i<noOFZeroes+noOFOnes) arr[i]=1;
            else arr[i]=2;
        }
        System.out.println();
        System.out.println("Sorted array  ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
