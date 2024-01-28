package Array;

public interface maximum_value_in_array {
    public static void main(String[] args) {
        int[] arr = {120, 34, 45, 67, 44, 56, 44, 56, 6754, 56};

        //another method is
        //use*
        //int  max= Integer.MIN_VALUE; that will be -2147483648

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];

        }
        System.out.println(max);
    }
}
