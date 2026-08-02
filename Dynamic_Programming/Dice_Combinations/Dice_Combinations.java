/*
 * Problem Name: Dice_Combinations
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-02
 */

import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    private static final int MOD = 1_000_000_007;
 
    public static int func(int n){
        int[] t= new int[n+1];
        t[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(j<=i){
                    t[i]=(t[i]+t[i-j])%MOD;
                }
            }
        }
        return t[n];
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.println(func(n));
	}
}