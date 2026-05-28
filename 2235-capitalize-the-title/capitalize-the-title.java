class Solution {
    public String capitalizeTitle(String title) {

        title = title.toLowerCase();

        int start = 0;

        char[] arr = title.toCharArray();

        // first word
        if (arr.length > 2 && arr[1] != ' ' && arr[2] != ' ') {
            arr[start] = Character.toUpperCase(arr[start]);
        }

        while (start < title.length() - 1) {

            if (arr[start] == ' ') {

                // check word length greater than 2
                if ((start + 3 < arr.length) && arr[start + 2] != ' ' && arr[start + 3] != ' ') {
                    arr[start + 1] =
                        Character.toUpperCase(arr[start + 1]);
                }
            }

            start++;
        }

        return new String(arr);
    }
}