class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int max = -1;
        
        // Find the maximum value to size the frequency array
        for (int i = 0; i < n; i++) {
            max = Math.max(arr1[i], max);
        }
        
        // Build the frequency array
        int[] a = new int[max + 1];
        for (int i = 0; i < n; i++) { // Fixed: loop up to n
            a[arr1[i]]++;
        }
        
        int j = 0; // Pointer to overwrite elements in arr1
        
        // Step 1: Place elements in the relative order of arr2
        for (int i = 0; i < m; i++) {
            while (a[arr2[i]] > 0) {
                arr1[j++] = arr2[i];
                a[arr2[i]]--;
            }
        }
        
        // Step 2: Place the remaining elements in ascending order
        for (int i = 0; i <= max; i++) {
            while (a[i] > 0) {
                arr1[j++] = i;
                a[i]--;
            }
        }
        
        return arr1;
    }
}