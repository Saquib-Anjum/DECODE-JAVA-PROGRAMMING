package Stack_.Part_1;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        int n=arr.length;
        System.out.println("Array is   ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] res = nextGreater(arr);
        System.out.println("Answer element is ");
        for(int ele:res){
            System.out.print(ele+" ");
        }

    }
    public static int[] nextGreater(int[] arr){
        int n= arr.length;
        java.util.Stack<Integer> st= new java.util.Stack<>();
        int[] res = new int[n];
        res[n-1]  =-1;
        st.push(arr[n-1]);
        //
        for (int i =n-2; i >=0 ; i--) {

            while( !st.isEmpty()&&st.peek()<arr[i] ){
                st.pop();
            }
            if(st.isEmpty()) res[i]=-1;
            else{
                res[i] =st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
}
