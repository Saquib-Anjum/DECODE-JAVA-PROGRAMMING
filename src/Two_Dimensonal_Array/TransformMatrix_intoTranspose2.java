package Two_Dimensonal_Array;

public class TransformMatrix_intoTranspose2 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n =arr.length;// row
        int m =arr[0].length;

        print(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        print(arr);

    }

    public static void print(int[][] arr) {
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

    }

}
