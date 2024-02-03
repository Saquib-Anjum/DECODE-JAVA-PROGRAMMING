package Two_Dimensonal_Array;

public class scoreFlipingMatrix {
    public static void main(String[] args) {
        int[] arr= {4,5,3,6,7};

        int[] res= new int[2];
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;


        // Write your code here.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];

            if (arr[i] != max) {
                if (arr[i] >= smax) smax = arr[i];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min) min= arr[i];
//

            if(arr[i]<smin && arr[i]>min) smin=arr[i];

        }

//        res[1]=smin;
//        res[0]=smax;
//
//        for(int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+" ");
//        }
        System.out.println( min);
        System.out.println(smin);
        System.out.println(max);
        System.out.println(smax);

    }
}
