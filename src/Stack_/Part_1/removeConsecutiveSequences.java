package Stack_.Part_1;

public class removeConsecutiveSequences {
    public static int[] remove(int[] arr){
        int n=arr.length;
        java.util.Stack <Integer> st = new java.util.Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0  ||st.peek()!=arr[i]){
              st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if(i==n-1 ||  arr[i] !=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] res = new int[st.size()];
        int m = res.length;
        for (int i = m-1; i >=0 ; i--) {
            res[i] =st.pop();

        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,4,4,4,5,7,2};
        System.out.println("Original array is  ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("After removing the consecutive  element  ");
        int[] res= remove(arr);
        for (int ele:res){
            System.out.print(ele+" ");{

            }
        }

    }

}
