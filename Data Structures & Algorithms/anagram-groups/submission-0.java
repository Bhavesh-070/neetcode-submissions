class Solution {

	/*
	 * Given an array of strings strs, group all anagrams together into sublists.
	 * You may return the output in any order.
	 * 
	 * An anagram is a string that contains the exact same characters as another
	 * string, but the order of the characters can be different.
	 * 
	 * Example 1:
	 * 
	 * Input: strs = ["act","pots","tops","cat","stop","hat"]
	 * 
	 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]] Example 2:
	 * 
	 * Input: strs = ["x"]
	 * 
	 * Output: [["x"]] Example 3:
	 * 
	 * Input: strs = [""]
	 * 
	 * Output: [[""]]
	 * 
	 */
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> hm = new HashMap<>();

		for (String str : strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);

			String key = new String(ch);

			if (!hm.containsKey(key)) {
				hm.put(key, new ArrayList());
			}

			hm.get(key).add(str);
		}

		return new ArrayList(hm.values());
	}
}
