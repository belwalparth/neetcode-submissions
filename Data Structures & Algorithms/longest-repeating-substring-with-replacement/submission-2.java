class Solution {
    public int characterReplacement(String s, int k) {

        int max = 0, max_freq = 0, l = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);

            max_freq = Math.max(max_freq, map.get(c));

            if ((i - l + 1) - max_freq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }

            max = Math.max(max, i - l + 1);
        }

        return max;
    }
}