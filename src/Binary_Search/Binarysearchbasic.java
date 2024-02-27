package Binary_Search;

import java.util.Scanner;

public class Binarysearchbasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,23,46,89,91,107,140,246};
        int n=arr.length;
        System.out.println("Array is   ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");

        }
        System.out.println();
        int target =107;
        int lo=0;
        int hi=n-1;
        int res=-1;
        boolean flag=false;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                flag=true;
                res=mid;
                break;

            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else if(arr[mid]<target){
                lo=mid+1;

            }
        }
        if (flag==true){
            System.out.println("Target is present  at index "+res );}
            else{
            System.out.println("target is not present  ");
            }



    }
}
