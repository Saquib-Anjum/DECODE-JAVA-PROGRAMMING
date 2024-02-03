package Two_Dimensonal_Array;

 class SquareMatrixTranspose {
    public static void main(String[] args) {
     int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
     int n =arr.length;// row
     int m =arr[0].length;
        System.out.println("Array is  ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }


        System.out.println();


        System.out.println("Transpose matrix is    ");


        for (int j= 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
