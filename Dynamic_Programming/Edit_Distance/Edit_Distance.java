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
    public static int func(String a,String b){
        int n=a.length();
        int m=b.length();
        
        int[][] t= new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            t[i][0] = i;
        }
 
        for (int j = 0; j <= m; j++) {
            t[0][j] = j;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=t[i-1][j-1];
                }
                else{
                    int insert=t[i][j-1];
                    int delete=t[i-1][j];
                    int replace=t[i-1][j-1];
                    t[i][j]=1+Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return t[n][m];
    }
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine();
	    String b=br.readLine();
	    System.out.println(func(a,b));
	}
}