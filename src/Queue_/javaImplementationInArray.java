package Queue_;

 class ArrayImplementation{
    int r=-1;
    int f=-1;
    int size = 0;

    int[] arr =new int[5];
    //adding element
     void add(int val){
        if(r==arr.length-1){
            System.out.println("Stack is full");
        }
        if(r==-1){
            f=r=0;
            arr[0] = val;
        }
        else{
            arr[++r] =val;
            size++;
        }
     }
     //retuning and removing top element in Queue
     int poll(){
      int x= f;
      f++;
      size--;
      return arr[x];
     }
      boolean isEmpty(){
         if(size==0) return true;
         else return false;

     }
     int peek(){
         return arr[f];
     }
     //display the Queue
     void display(){
         for(int i =f;i<=r;i++ ){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }

}
public class javaImplementationInArray {
    public static void main(String[] args) {
        ArrayImplementation q = new ArrayImplementation();
        q.add(34);
        q.add(76);
        q.add(8);
        q.add(43);
        q.display();
        System.out.println(q.peek());
        q.poll();
        q.display();

    }
}
