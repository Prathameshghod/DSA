class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        
        // Edge case
        if (originalColor == color) return image;
        
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int originalColor, int color) {
        // Boundary + condition check
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length 
            || image[r][c] != originalColor) {
            return;
        }
        
        // Fill color
        image[r][c] = color;
        
        // 4 directions
        dfs(image, r + 1, c, originalColor, color);
        dfs(image, r - 1, c, originalColor, color);
        dfs(image, r, c + 1, originalColor, color);
        dfs(image, r, c - 1, originalColor, color);
    }
}