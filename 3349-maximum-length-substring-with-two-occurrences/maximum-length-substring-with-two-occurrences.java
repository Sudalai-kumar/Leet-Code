class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> count = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            while (count.get(ch) > 2) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}