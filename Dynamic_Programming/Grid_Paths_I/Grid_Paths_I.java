/*
 * Problem Name: Grid_Paths_I
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-06
 */

/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
public class Main
{
    public static int solve(char[][] a,int i,int j){
        if(i==1 && j==1){
            return 1;
        }
        if(i<=0 || j<=0){
            return 0;
        }
        if(a[i-1][j-1]=='*'){
            return 0;
        }
        return solve(a,i-1,j)+solve(a,i,j-1);
    }
    public static int func(char[][] a){
        int n=a.length;
        return solve(a,n,n);
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