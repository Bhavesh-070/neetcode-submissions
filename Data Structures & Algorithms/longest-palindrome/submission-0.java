class Solution {
    public int longestPalindrome(String s) {
        int[] frequency = new int[128];

        for (char ch : s.toCharArray()) {
            frequency[ch]++;
        }

        int length = 0;

        boolean hasOddCount = false;

        for (int count : frequency) {
            if (count % 2 == 0) {
                length = length + count;
            } else {
                length += count - 1;
                hasOddCount = true;
            }
        }
        if (hasOddCount) {
            length += 1;
        }
        return length;
    }
}