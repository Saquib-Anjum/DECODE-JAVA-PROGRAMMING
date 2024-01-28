package Array;

public class passing_values_in_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
                int x=6;
        System.out.println("before change of integer value");

        System.out.println(x);
        //call for integer value
        int call=change(x);
        System.out.println("after change of integer value");

        System.out.println(call);
        System.out.println("before change       "+arr[0]);
        //
         change2(arr);
        System.out.println(" after change            "+arr[0]);

    }

    private static void change2(int[] arr) {
        arr[0]=9;
    }

    public static int change(int x){
       return x=10;
    }


}
