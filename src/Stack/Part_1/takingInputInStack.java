package Stack.Part_1;
import java.util.*;

public class takingInputInStack {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Stack<Integer>  st = new Stack<>();
        System.out.println("Enter the size of Stack;");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println("enter the element of stack "+i+" index ");
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println(st);


    }
}
