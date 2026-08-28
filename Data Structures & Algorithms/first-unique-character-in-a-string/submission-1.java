class Solution {
    public int firstUniqChar(String s) {
        // Need to return index of first unique character means non repeated character
        // Input: s = "neetcodeneet"
        // here i have used brute force approach

        // Removed extra variable char ch [] it was taking extra space 
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++)
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }

            if (count == 1) {
                return i;
            }
        }

        return -1;
    }
}