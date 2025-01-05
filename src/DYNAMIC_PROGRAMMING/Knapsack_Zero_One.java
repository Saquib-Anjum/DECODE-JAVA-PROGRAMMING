package DYNAMIC_PROGRAMMING;

public class Knapsack_Zero_One {
    public static void main(String[] args) {
        int C=9;
        int[] val = {5,3,7,17};
        int[] wt =  {1,2,8,10};
        int n = wt.length;
        int[][]dp = new int[n][C+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans = KnapsackHelper(0,wt,val,C,dp);
        System.out.println(ans);
    }
    public static int KnapsackHelper(int i ,int[] wt ,int[] val,int C,int[][] dp){
       if(i==wt.length) return 0;
       if(dp[i][C]!=-1) return dp[i][C];
       int skip = KnapsackHelper(i+1,wt,val,C,dp);
       if(wt[i]>C) return dp[i][C] = skip;
       int pick = val[i] + KnapsackHelper(i+1,wt,val,C-wt[i],dp);
       return dp[i][C] = Math.max(pick,skip);
    }
}
