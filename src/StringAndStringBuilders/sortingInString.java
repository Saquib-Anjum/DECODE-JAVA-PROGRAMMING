package StringAndStringBuilders;

import java.util.Arrays;

public class sortingInString {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("uhgfdgghgkghfgdfgdfjgjfhgjdhgdhgjdhvdfjshkhhhjvndjghkugdvvkjghedf");
        System.out.println(sb);
       String a=  sb.toString();
       char[] ch=a.toCharArray();
        for(char ele:ch){
            System.out.print(ele+" ");

        }
        //sort
        System.out.println();
        System.out.println("sorted string  ");
        Arrays.sort(ch);

        for(char ele:ch){
            System.out.print(ele+" ");

        }

    }
}
