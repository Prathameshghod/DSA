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
    public static final int MOD = 1000_000_007;
 
    public static int func(int n){
        int[][] t= new int[n+1][2];
        t[1][0]=1;
        t[1][1]=1;
        for(int i=2;i<n+1;i++){
             t[i][0] = (int)(((long)4 * t[i - 1][0] + t[i - 1][1]) % MOD);
            t[i][1] = (int)(((long)2 * t[i - 1][1] + t[i - 1][0]) % MOD);
        }
        return (int)((long) t[n][0]+(long) t[n][1])%MOD;
    }
    
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int tc = Integer.parseInt(br.readLine());
 
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(func(n));
        }
    }
}