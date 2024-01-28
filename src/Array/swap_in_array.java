package Array;

public class swap_in_array {
    public static void main(String[] args) {
        int[] num= new int[12];
        num[0]=100;
        num[11]=200;
        int temp=num[0];
        num[0]=num[11];
        num[11]=temp;
        System.out.println(num[0]);
        System.out.println(num[11]);
    }
}
