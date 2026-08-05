/*
 * Problem Name: Grid_Paths_I
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-05
 */

/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
public class Main
{
    public static int func(char[][] a){
        int n=a.length;
        int MOD = 1_000_000_007;
        if (a[0][0] == '*' || a[n - 1][n - 1] == '*') {
            return 0;
        }
        int[][] dp= new int[n][n];
        dp[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]=='*'){
                    dp[i][j]=0;
                    continue;
                }
                if(i>0){
                    dp[i][j]=(dp[i][j]+dp[i-1][j])%MOD;
                }
                if(j>0){
                    dp[i][j]=(dp[i][j]+dp[i][j-1])%MOD;
                }
            }
        }
        return dp[n-1][n-1];
    }
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        char[][] a = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray();
        }
        
		System.out.println(func(a));
	}
}