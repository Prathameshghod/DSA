/*
 * Problem Name: Book_Shop
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-02
 */

import java.util.*;
public class Main
{
    public static int solve(int n,int x,int[] a,int[] b){
       if(n==0 || x==0){
           return 0;
       }
       if(a[n-1]<=x){
           return Math.max(
            b[n - 1] + solve(n - 1, x - a[n - 1], a, b),
            solve(n - 1, x, a, b)
        );  
       }    
       return solve(n-1,x,a,b);
    }
    public static int func(int n,int x,int[] a,int[] b){
        return solve(n,x,a,b);
    }
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
         for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
		System.out.println(func(n,x,a,b));
	}
}
    