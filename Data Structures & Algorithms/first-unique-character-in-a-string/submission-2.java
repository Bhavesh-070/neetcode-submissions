class Solution {
    public int firstUniqChar(String s) {
        // This is second approach with using HashMap
        // Frist i stored key and value in HashMap and then whose value is 1 return their inddex

        Map<Character, Integer> hm = new HashMap<Character, Integer>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}