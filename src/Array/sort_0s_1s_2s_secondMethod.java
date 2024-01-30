package Array;

public class sort_0s_1s_2s_secondMethod {
    public static void main(String[] args) {
        //dutch flag algorithm
        int[] arr={1,0,0,0,2,2,1,1,0,1,2,2,0,1,0,2,0,2,0,1};
        int n=arr.length;

        System.out.println("Array is  ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        int mid=0;
        int high=n-1;
       int  low=0;
        while(mid<=high){


            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }

            else if(arr[mid]==1){
                arr[mid]=1;
                    mid++;
                }


             else{
                 //arr[mid]==2
                    int temp=arr[mid];
                    arr[mid]=arr[high];
                   arr[high]=temp;
                    high--;
             }


            }


        System.out.println();
        System.out.println("sorted Array is    ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
