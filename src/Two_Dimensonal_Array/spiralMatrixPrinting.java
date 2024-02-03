package Two_Dimensonal_Array;

public class spiralMatrixPrinting {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n =arr.length;
        System.out.println("Array is   ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");


            }
            System.out.println();
        }
        System.out.println("Spiral matrix is   ");
        int minc=0;
        int maxc=n-1;
        int minr=0;
        int maxr=n-1;

        while(minc<=maxc&&minr<=maxr) {
                //first step

            for (int j = minc; j <= maxc; j++) {
                    System.out.print(arr[minr][j] + " ");
            }
            minr++;

                //break
            if(minr>maxr||minc>maxc) break;

            //second step

            for (int i = minr; i <= maxr; i++) {
                    System.out.print(arr[i][maxc] + " ");
            }
            maxc--;

            if(minr>maxr||minc>maxc) break;
            //third step

            for (int j = maxc; j >=minc; j--) {
                    System.out.print(arr[maxr][j] + " ");



            }
            maxr--;

            if(minr>maxr||minc>maxc) break;
            //forth step
            for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
            }
            minc++;
            if(minr>maxr||minc>maxc) break;
        }

    }
}
