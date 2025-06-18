class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 2; i < n; i += 3) {
            if (nums[i] - nums[i - 2] > k) {
                return new int[0][];
            }
            List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[i - 2]);
            triplet.add(nums[i - 1]);
            triplet.add(nums[i]);
            res.add(triplet);
        }
        
        int[][] ans = new int[res.size()][3];
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < 3; j++) {
                ans[i][j] = res.get(i).get(j);
            }
        }
        return ans;
    }
}
