/*
 * Problem Name: Book_Shop
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-02
 */

import java.util.*;
public class Main
{
    public static int func(int n,int x,int[] a,int[] b){
        int[][] t = new int[n + 1][x + 1];
 
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= x; j++) {
            if (a[i - 1] <= j) {
                // Choice 1: Include item i-1 OR Choice 2: Exclude item i-1
                t[i][j] = Math.max(b[i - 1] + t[i - 1][j - a[i - 1]], t[i - 1][j]);
            } else {
                // Item i-1 is too heavy, cannot include it
                t[i][j] = t[i - 1][j];
            }
        }
    }
 
    return t[n][x];
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