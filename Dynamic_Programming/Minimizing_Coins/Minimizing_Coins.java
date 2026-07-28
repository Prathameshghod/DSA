/*
 * Problem Name: Minimizing_Coins
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-07-28
 */

/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
 
public class Main
{
    public static int solve(int s,int n,int[] a,int[][] t){
        if(s==0){
            return 0;
        }
        if(n==0){
            return Integer.MAX_VALUE;
        }
        if(t[n][s]!=-1){
            return t[n][s];
        }
        if(a[n-1]<=s){
            return Math.min(1+solve(s-a[n-1],n,a,t),solve(s,n-1,a,t));
        }
        else{
            return solve(s,n-1,a,t);
        }
    }
    public static int func(int n,int s,int[] a){
        int[][] t= new int[n+1][s+1];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(s,n,a,t);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println(func(n,s,a));
	}
}