package Arrays;

public class SecondLARGEST {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,789,898,98,897,98,789,6787};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max)  max=arr[i];

        }
        int secmax= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max){
                if(arr[i]>=secmax)  secmax=arr[i];
            }

        }


        System.out.println("maximum is "+max);
        System.out.println("second largest is  "+secmax);
    }
}
