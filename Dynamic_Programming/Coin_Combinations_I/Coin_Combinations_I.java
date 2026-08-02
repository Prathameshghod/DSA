/*
 * Problem Name: Coin_Combinations_I
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-08-02
 */

/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
public class Main
{
    static final int MOD = 1000000007;
    public static int func(int n,int s,int[] a){
        int[] t= new int[s+1];
        t[0]=1;
        for(int j=1;j<s+1;j++){
            for(int i:a){
                if(i<=j){
                    t[j]=(t[j]+t[j-i])%MOD;
                }
            }
        }
        return t[s];
    }
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(func(n,x,a));
	}
}