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
    public static int func(int n,int s,int[] a){
        int[][] t= new int[n+1][s+1];
        for(int j=1;j<s+1;j++){
            t[0][j]=Integer.MAX_VALUE;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<s+1;j++){
                if(a[i-1]<=j){
                    t[i][j]=Math.min(1+t[i][j-a[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][s]<0?-1:t[n][s];
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