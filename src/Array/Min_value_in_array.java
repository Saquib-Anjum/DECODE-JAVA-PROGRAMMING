package Array;

public class Min_value_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,7,6,-34,-34,-5};
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) min=arr[i];

        }
        System.out.println(min);
    }
}
