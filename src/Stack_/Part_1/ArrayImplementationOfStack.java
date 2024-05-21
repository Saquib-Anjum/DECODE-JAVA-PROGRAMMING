package Stack_.Part_1;

class Stack{
    int[] arr = new int[50];
    //for index
    int idx=0;
    void push(int x){
     arr[idx]= x;
     idx++;
    }
    //for pop the element from the stack
    int pop(){
      if(idx == 0){
          System.out.println("Stack is Empty ");
          return -1;
      }
      int top = arr[idx-1];
      arr[idx-1] =0;
      idx--;
      return top;
    }
    // find the peek element from the stack
    int peek(){
        if(idx == 0){
            System.out.println("Stack is Empty ");
            return -1;
        }
        return arr[idx-1];

    }
    void Display(){
       for(int i=0;i<=idx-1;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
    }
    //to find out that stack is empty or not
    boolean isEmpty(){
    if(idx==0) return true;
    return false;
    }

    boolean isFull(){
     if(idx==arr.length) return true;
     return false;
    }
    int size(){
    return idx;
    }

}
public class ArrayImplementationOfStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(23);
        st.push(96);
        st.push(58);
        st.push(20);
        st.push(71);
        st.Display();
        st.pop();
        st.Display();
        System.out.println(st.isEmpty());
        System.out.println( st.size());
        System.out.println(st.peek());

    }
}

