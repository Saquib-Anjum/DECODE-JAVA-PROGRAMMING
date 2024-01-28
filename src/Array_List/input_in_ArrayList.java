package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class input_in_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array List");
        System.out.print("Enter the number of element in arraylist   ");
        int n=sc.nextInt();

        //initializing arraylist
        ArrayList <Integer> al=new ArrayList<Integer>(1);
        //taking input using loop

        for (int i = 0; i <n ; i++) {
            System.out.print("Enter the element of  index   "+" "+i+" ");
            int element =sc.nextInt();
            al.add(element);
        }
        System.out.println(al);


    }
}
