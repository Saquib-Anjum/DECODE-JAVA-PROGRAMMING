package Heap_and_PriorityQueue;
class MinHeap{
    int[] arr;
    int size;
    MinHeap(int capacity){
        arr=new int[capacity];
        size=0;
    }
   public  void add(int num ){
         arr[size++]=num;
         upheapify(size-1);
    }
    public void upheapify(int idx){
        int parent = (idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void swap(int idx,int parent){
        if(idx==0) return;
      int temp = arr[idx];
      arr[idx]=arr[parent];
      arr[parent]= temp;
    }
    public int size(){
        return size;
    }
    public int peek(){
        return arr[0];
    }
    public int[] print(){
        return arr;
    }
    public int remove(){
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downheapify(0);
        return peek;
    }
    public void downheapify(int i){
        if(i>=size-1) return ;
        int lc = 2*i+1;
        int rc = 2*i+2;
        int minIdx = i;
        if(lc<size && arr[lc]<arr[minIdx]) minIdx  = lc;
        if(rc<size && arr[rc]<arr[minIdx]) minIdx  = rc;
        if(i==minIdx) return;
        swap(i,minIdx);
        downheapify(minIdx);
    }
}
public class MinHeapImplementationByArray {
    public static void main(String[] args) {
        MinHeap pq = new MinHeap(10);
        pq.add(2);
        pq.add(6);
        pq.add(5);
        pq.add(9);
        System.out.println(pq.size());
        pq.add(12);
        System.out.println(pq.peek());
        System.out.println("size  : "+ pq.size());
        pq.add(2);
        pq.add(6);
        pq.add(5);
        pq.add(9);
        pq.add(34);
        int [] arr=pq.print();
        print(arr);
        System.out.println(pq.size());
        pq.remove();
        System.out.println("size : "+pq.size+" peek : "+pq.peek());
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
