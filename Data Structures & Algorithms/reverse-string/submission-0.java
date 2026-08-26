class Solution {
    public void reverseString(char[] s) {
        // Input: s = ["n","e","e","t"]

        // Output: ["t","e","e","n"]
        /*
        Example 2:

        Input: s = ["r","a","c","e","c","a","r"]

        Output: ["r","a","c","e","c","a","r"]

        */

        char temp;
        int left = 0; int right = s.length - 1;
        while (left < right) {
            // Swap the characters
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}