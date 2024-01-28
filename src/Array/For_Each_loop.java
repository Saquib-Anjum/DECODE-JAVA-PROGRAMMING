package Array;
import java.util.Arrays;
public class For_Each_loop {
    public static void main(String[] args) {
        int[] arr ={20,67,87,56,54,56,98,76,43,21,3432,65};
        for (int ele :arr)
            System.out.print(ele+" ");

        Arrays.sort(arr);
        System.out.println();
        System.out.println("sorted array      ");
        for(int element:arr){
            System.out.print(element+" ");
        }

    }
}
