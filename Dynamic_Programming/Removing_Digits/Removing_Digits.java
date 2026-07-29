/*
 * Problem Name: Removing_Digits
 * Language: Java
 * Category: Dynamic_Programming
 * Date: 2026-07-29
 */

/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
 
public class Main
{
 
    public static int func(int n){
        int x=0;
        while(n>0){
            int a=n;
            int c=0;
            while(a>0){
                c=Math.max(c,a%10);
                a/=10;
            }
            n=n-c;
            x++;
        }
        return x;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
	
		System.out.println(func(n));
	}
}