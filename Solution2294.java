class Solution2294{
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int count = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - count > k) {
                ans++;
                count = nums[i];
            }
        }
        return ans;
    }
}
