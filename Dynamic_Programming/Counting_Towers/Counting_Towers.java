/*
 * Problem Name: Counting_Towers
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
    public static final int MOD = 1000000007;
    public static int solve(int n,int s){
        if(n==1){
            return 1;
        }
        if(s==0){
            return (4*solve(n-1,0)+solve(n-1,1))%MOD;
        }
        else{
            return (2*solve(n-1,1)+solve(n-1,0))%MOD;
        }
        
    }
    public static int func(int n){
        return (solve(n,0)+solve(n,1))%MOD;
    }
	public static void main(String[] args) throws Exception{
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    
	    String line= br.readLine();
	    if(line==null || line.trim().isEmpty()){
	        return;
	    }
	    int t=Integer.parseInt(line.trim());
	    while(t-->0){
	        line=br.readLine();
	        while(line!=null && line.trim().isEmpty()){
	            line=br.readLine();
	        }
	        if(line==null){
	            break;
	        }
	        int n=Integer.parseInt(line.trim());
	        System.out.println(func(n));
	    }
	}
}