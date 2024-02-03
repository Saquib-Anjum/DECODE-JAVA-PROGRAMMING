package Two_Dimensonal_Array;

public class rotateMatrix90degree {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Array is  ");
        int n =arr.length;// row
        int m =arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = arr[j][i];
            }}
        System.out.println("Transpose is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("After 90deg rotation");

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0; j--) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }
}
