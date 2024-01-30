package Array;

public class merge_to_sorted_array {
    public static void main(String[] args) {
        int[] a={2,4,5,7,9};
        int[] b={4,6,9,10,11};
        int[] c= new int[a.length+b.length];


       int i=0;
       int j=0;
       int k= 0;
       while(i<a.length  &&j<b.length) {
           if (a[i] <= b[j]) {
               c[k] = a[i];
               i++;
           } else {
               c[k] = b[j];
               j++;
           }

           k++;
       }

           if (i == a.length) {
               while (j < b.length) {
                   c[k] = b[j];
                   j++;
                   k++;
               }
           }
           if (j== b.length) {
               while (j <a.length) {
                   c[k] = a[i];
                   i++;
                   k++;
               }
           }

        System.out.println();
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
