package StringAndStringBuilders;

public class maxStringValue {
    public static void main(String[] args) {
        String[] arr= {"123","4345","4534","4532"};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int n=Integer.parseInt(arr[i]);
            max=Math.max(max,n);

        }
        System.out.println(max);

    }
}
