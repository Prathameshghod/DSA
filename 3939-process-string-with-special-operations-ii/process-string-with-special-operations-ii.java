class Solution {

    private boolean validK(long k, long size) {
        return k >= 0 && k < size;
    }

    public char processStr(String s, long k) {

        long size = 0;
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == '*') { 
                if (size > 0) --size; 
            } else if (c == '#') { 
                size *= 2;
            } else if (c != '%') ++size; 
        }

        if (!validK(k, size)) return '.';

        for (int i = chars.length - 1; i >= 0; --i) {
            char c = chars[i];
            if (c == '*') {
                ++size;
            } else if (c == '#') {
                size = size / 2;
                if (k >= size) k = k % size;
            } else if (c == '%') {
                k = size - k - 1;
            } else {
                if (k == size - 1) return c;
                --size;
            }
        }

        return '.';

        
    }
}