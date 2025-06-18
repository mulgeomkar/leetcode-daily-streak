class Solution2966 {
    public List<List<Integer>> divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 2; i < n; i += 3) {
            if (nums[i] - nums[i - 2] > k) {
                return new ArrayList<>();
            }
            List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[i - 2]);
            triplet.add(nums[i - 1]);
            triplet.add(nums[i]);
            res.add(triplet);
        }
        return res;
    }
}