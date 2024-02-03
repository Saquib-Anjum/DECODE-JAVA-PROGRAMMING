package Two_Dimensonal_Array;

public class sumofAllElement {
    public static void main(String[] args) {
        int[][] arr ={{56,65,68,45},{87,76,56,89},{12,34,33,99},{23,98,76,54}} ;
        int n=arr.length;
        int m=arr[0].length;
        int sum =0;

        //array printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("sum is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum+=arr[i][j];
            }

        }
        System.out.println(sum);

    }
}
