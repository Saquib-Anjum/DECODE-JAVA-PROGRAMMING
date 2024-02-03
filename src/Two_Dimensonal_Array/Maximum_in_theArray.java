package Two_Dimensonal_Array;

public class Maximum_in_theArray {
    public static void main(String[] args) {
        int[][] arr = {{12,43,65,76},{67,87,56,87},{67,90,89,68},{98,76,54,32},{87,65,34,56}};
        int n= arr.length;
        int m =arr[0].length;
        //printing array
        System.out.println("Array is  ");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();

        int max  =Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                max= Math.max(max,arr[i][j]);

            }

        }
        System.out.println("Maximum is    "+max);
    }
}
