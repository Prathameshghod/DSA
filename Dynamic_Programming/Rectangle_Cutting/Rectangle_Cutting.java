/*
 * Problem Name: Rectangle_Cutting
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
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
	    int[][] t= new int[n+1][m+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
               if(i==j){
                   t[i][j]=0;
                   continue;
               }
               t[i][j] = Integer.MAX_VALUE;
               for(int a=1;a<i;a++){
                   t[i][j]=Math.min(t[i][j],t[a][j]+t[i-a][j]+1);
               }
               for(int b=1;b<j;b++){
                   t[i][j]=Math.min(t[i][j],t[i][b]+t[i][j-b]+1);
               }
            }
        }
        
        System.out.println(t[n][m]);
	}
}