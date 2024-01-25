package Arrays;

import java.util.Scanner;

public class output_of_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n= scan.nextInt();

        System.out.println("Enter the number of index ");
        int[] arr= new int[n];
        //input loop
        for (int i = 0; i <n; i++) {
             arr[i]=scan.nextInt();

        }

//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;
//        arr[5]=60;
//        arr[6]=70;
        //output in loop
        for(int i=0;i<7;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
