/*
 * Problem Name: Array_Description
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-03
 */

/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
public class Main
{
    private static final int MOD = 1_000_000_007;
    public static int solve(int idx,int n,int x,int[] a,int prev,int[][] t){
        if(idx==n){
            return 1;
        }
        if(t[idx][prev]!=-1){
            return t[idx][prev];
        }
        if(a[idx]!=0){
            if(prev==0 || Math.abs(a[idx]-prev)<=1){
                return t[idx][prev]=solve(idx+1,n,x,a,a[idx],t);
            }
            else{
                return t[idx][prev]=0;
            }
        }
        int b=0;
        if(idx==0 || prev==0){
            for(int i=1;i<=x;i++){
                b+=solve(idx+1,n,x,a,i,t);
            }
        }
        else{
            for(int i=prev-1;i<=prev+1;i++){
                b+=solve(idx+1,n,x,a,i,t);
            }
        }
        return t[idx][prev]=b;
    }
    public static int func(int n,int x,int[] a){
        int[][] t= new int[n+1][x+1];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(0,n,x,a,0,t)%MOD;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();       
	    }
	   // int n=3;
	   // int x=5;
	   // int[] a={2,0,2};
	    System.out.println(func(n,x,a));
	}
}