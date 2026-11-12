
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int target = -nums[i];
            int lp = i + 1;
            int rp = nums.length - 1;

            while (lp < rp) {

                int sum = nums[lp] + nums[rp];

                if (sum == target) {

                    res.add(List.of(nums[i], nums[lp], nums[rp]));

                    lp++;
                    rp--;

                    while (lp < rp && nums[lp] == nums[lp-1]) {
                        lp++;
                    }

                    while (lp < rp && nums[rp] == nums[rp+1]) {
                        rp--;
                    }
                }

                else if (sum < target) {
                    lp++;
                }

                else {
                    rp--;
                }
            }
        }

        return res;
    }
}
