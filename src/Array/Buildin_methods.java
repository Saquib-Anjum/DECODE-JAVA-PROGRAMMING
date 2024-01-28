package Array;
import java.util.Arrays;
public class Buildin_methods {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 9, 5, };
        System.out.println("original Array ");
        for (int i = 0; i <arr.length ; i++) System.out.print(arr[i] + " ");
        System.out.println();
        Arrays.sort(arr);
        System.out.println("sorted array");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


        }
    }

