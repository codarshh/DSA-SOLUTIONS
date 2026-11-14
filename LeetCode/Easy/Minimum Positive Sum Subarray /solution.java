class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;

        for (int size = l; size <= r; size++) {
            int left = 0;
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += nums.get(i);
            }
            if (sum > 0 && sum < ans) {
                ans = sum;
            }
            for (int right = size; right < n; right++) {
                sum += nums.get(right);
                sum -= nums.get(left);
                left++;

                if (sum > 0 && sum < ans) {
                    ans = sum;
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}