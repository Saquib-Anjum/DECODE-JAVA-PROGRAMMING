package Two_Dimensonal_Array;

public class forEach {
    public static void main(String[] args) {
        System.out.println("1D Array is    ");
        int[] a= {1,3,5,7,8,8,9,5};
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("2D Array is   ");
        int[][] b = {{1,2,3},{4,5,6,},{6,7,8}};
        for(int[] ele:b){
            for(int  x:ele){
                System.out.print(x+"  ");

            }
            System.out.println();
        }
    }
}
