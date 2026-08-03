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
import java.io.*;
public class Main
{
    private static final int MOD = 1_000_000_007;
    
    public static int func(int n,int x,int[] a){
        int[][] t= new int[n][x+1];
        if(a[0]==0){
            for(int j=1;j<=x;j++){
                t[0][j]=1;     
            }
        }
        else{
            t[0][a[0]]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<x+1;j++){
                if(a[i]!=0 && a[i]!=j){
                    continue;
                }
                for(int prev=j-1;prev<=j+1;prev++){
                    if(prev>=1 && prev<=x){
                        t[i][j]=(t[i][j] + t[i-1][prev])%MOD;
                    }
                }
            }
        }
        int r=0;
        for(int j=1;j<=x;j++){
            r=(r+t[n-1][j])%MOD;
        }
        return r;
    }
	public static void main(String[] args) throws Exception{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st= new StringTokenizer(br.readLine());
	  
	    int n=Integer.parseInt(st.nextToken());
	    int x=Integer.parseInt(st.nextToken());
	    
	    int[] a=new int[n];
	    
	    st = new StringTokenizer(br.readLine());
	    
	    for(int i=0;i<n;i++){
	        a[i]=Integer.parseInt(st.nextToken());       
	    }
	   // int n=3;
	   // int x=5;
	   // int[] a={2,0,2};
	    System.out.println(func(n,x,a));
	}
}