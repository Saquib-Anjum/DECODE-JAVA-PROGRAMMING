package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicsOFARRAYLIST {
    public static void main(String[] args) {
        //int[] arr={1,3,7,8,9,7}
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al =new ArrayList<>(6);
        //initialize the array list
        al.add(0,9);
        al.add(1,8);
        al.add(2,7);
        al.add(3,6);
        al.add(4,5);
        al.add(5,4);
//printing array list
        System.out.println(al);
        System.out.println("printing using loop");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        //modify

        al.set(2,600);
        System.out.println("size of arraylist    "+al.size());
        System.out.println("modified array  ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }

        //increasing size of an array
        System.out.println();
        System.out.println("adding element in array");
        al.add(790);
        System.out.println("size of array list   "+al.size());
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
        }
    }

