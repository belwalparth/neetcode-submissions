
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for (int val : nums) {
            values.add(val);
        }

        int max_len = 0;

        for (int val : values) {
            if (!values.contains(val - 1)) {
                int temp = 1;

                while (values.contains(val + temp)) {
                    temp++;
                }

                max_len = Math.max(max_len, temp);
            }
        }

        return max_len;
    }
}
