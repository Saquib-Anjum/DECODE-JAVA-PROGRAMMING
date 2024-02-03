package Two_Dimensonal_Array;

public class Genereatematrix {
   public static void main(String[] args) {
        int n=4;
        int[][] res = new int[n][n];
        int a=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j]=a++;
                System.out.print(res[i][j]+" ");

            }
            System.out.println();

        }
        //spiral  matrix
       System.out.println("Spitel matrix is  ");
       int minr=0;
        int minc=0;
        int maxr=n-1;
        int maxc=n-1;
        //left to right
       while (minc <= maxc || minr <=maxr) {
           for (int j = minc; j <=maxc ; j++) {
               System.out.print(res[minr][j]+" ");

           }
           minr++;
           if(minc>maxc  ||minr>maxr) break;
          //top to down
           for (int i = minr; i <=maxr ; i++) {
               System.out.print(res[i][maxc]+" ");

           }
           maxc--;
           if(minc>maxc  ||minr>maxr) break;
           //right to left

           for (int j = maxc; j >=minc; j--) {
               System.out.print(res[maxr][j]+" ");
           }
           maxr--;
           if(minc>maxc  ||minr>maxr) break;
           //down to up
           for (int i = maxr; i >=minr ; i--) {
               System.out.print(res[i][minc]+" ");
           }
           minc++;
       }

    }
}
