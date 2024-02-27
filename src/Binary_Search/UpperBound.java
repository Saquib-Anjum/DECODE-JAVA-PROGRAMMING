package Binary_Search;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr={10,23,54,67,87,90,65,34,56,89,69};
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
        System.out.println();
        int ub=n;
        int target =68;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(arr[mid]>target){
                ub=Math.min(ub,mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println("upper  bound is   "+ub);
    }
}
