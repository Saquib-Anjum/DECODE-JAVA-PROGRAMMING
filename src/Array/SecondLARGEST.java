package Array;

public class SecondLARGEST {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7,8,789,898,98,897,98,789,6787};
       // int[] arr = {1,2,3,8,8,5,7,6};
        int max=Integer.MIN_VALUE;
        int secmax= Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max)  max=arr[i];
            if(arr[i]!=max){
              if(arr[i]>=secmax)  secmax=arr[i];
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=max){
//                if(arr[i]>=secmax)  secmax=arr[i];
//            }
//
//        }


        System.out.println("maximum is "+max);
        System.out.println("second largest is  "+secmax);
    }
}
