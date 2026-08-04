/*
 * Problem Name: Edit_Distance
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-04
 */

/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
    public static int solve(String a,String b,int n,int m,int[][] t){
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }
        if(t[n][m]!=-1){
            return t[n][m];
        }
        if(a.charAt(n-1)==b.charAt(m-1)){
            return t[n][m]=solve(a,b,n-1,m-1,t);
        }
        else{
            int insert=solve(a,b,n,m-1,t);
            int delete=solve(a,b,n-1,m,t);
            int replace=solve(a,b,n-1,m-1,t);
            return t[n][m]=1+Math.min(insert,Math.min(delete,replace));
        }
    }
    public static int func(String a,String b){
        int n=a.length();
        int m=b.length();
        
        int[][] t= new int[n+1][m+1];
        for(int[] i:t){
            Arrays.fill(i,-1);
        }
        return solve(a,b,a.length(),b.length(),t);
    }
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine();
	    String b=br.readLine();
	    System.out.println(func(a,b));
	}
}