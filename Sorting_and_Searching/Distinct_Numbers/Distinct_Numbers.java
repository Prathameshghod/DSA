/*
 * Problem Name: Distinct_Numbers
 * Language: Java
 * Category: Sorting_and_Searching
 * Date: 2026-07-31
 */

import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
 
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        HashSet<Integer> set = new HashSet<>();
 
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
 
        System.out.println(set.size());
    }
}