/*
 * Problem Name: Distinct_Numbers
 * Language: Java
 * Category: Sorting_and_Searching
 * Date: 2026-07-31
 */

 
import java.util.*;
public class Main{
 
    static int distinctValuesMap(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap.size();
    }
 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        System.out.println(distinctValuesMap(a));
    }
}