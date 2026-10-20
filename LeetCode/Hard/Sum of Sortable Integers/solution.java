class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && canSort(nums,i)) {
                ans += i;
            }
        }
        return ans;
    }

    private boolean canSort(int[] nums, int k) {
        int n = nums.length;
        int prevMax = 0;
        boolean firstBlock = true;

        for (int i = 0; i < n; i += k) {

            int min = nums[i];
            int max = nums[i];
            int decreaseCount = 0;
            
            for (int j = i; j < i + k; j++) {
                int next = (j + 1 == i + k) ? i : j + 1;

                if (nums[j] > nums[next]) {
                    decreaseCount++;
                    if (decreaseCount > 1) {
                        return false;
                    }
                }

                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
            }

            if (!firstBlock && prevMax > min) {
                return false;
            }

            firstBlock = false;
            prevMax = max;
        }

        return true;
    }
}