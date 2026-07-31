/*
 * Problem Name: Distinct_Numbers
 * Language: Java
 * Category: Sorting_and_Searching
 * Date: 2026-07-31
 */

/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
public class Main
{
    public static int func(int n,int[] a){
        Set<Long> b=new HashSet<>();
        for(int i:a){
            b.add((long) i);
        }
        return b.size();
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println(func(n,a));
	}
}