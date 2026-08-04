/*
 * Problem Name: Longest_Common_Subsequence
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
		
	    int[] a= new int[n];
	    st= new StringTokenizer(br.readLine());
	    for(int i=0;i<n;i++){
	        a[i]=Integer.parseInt(st.nextToken());
	    }
	    
	     int[] b= new int[m];
	     st= new StringTokenizer(br.readLine());
	    for(int i=0;i<m;i++){
	        b[i]=Integer.parseInt(st.nextToken());
	    }
	   // int n=8;
	   // int m=6;
	   // int[] a={3,1, 3, 2, 7, 4, 8, 2};
	   // int[] b={6, 5, 1, 2, 3, 4};
	    int[][] t= new int[n+1][m+1];
    
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a[i-1]==b[j-1]){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        int l= t[n][m];
        int i=n;
        int j=m;
       ArrayList<Integer> ans = new ArrayList<>();
 
        while (i > 0 && j > 0) {
            if (a[i - 1] == b[j - 1]) {
                ans.add(a[i - 1]);
                i--;
                j--;
            } else if (t[i - 1][j] > t[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        
        Collections.reverse(ans);
        
        System.out.println(l);
        for (int x : ans) {
            System.out.print(x + " ");
        }
	}
}