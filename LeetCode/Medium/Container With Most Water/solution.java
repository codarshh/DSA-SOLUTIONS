class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lo = 0;
        int hi = height.length - 1;

        while (lo < hi) {
            int width = hi-lo;
            int currentHeight = 0;
            if (height[lo] < height[hi]) {
                currentHeight = height[lo];
                lo++;
            } else {
                currentHeight = height[hi];
                hi--;
            }

            int currentArea = currentHeight * width;
            if (currentArea > maxWater) {
                maxWater = currentArea;
            }

        }
        return maxWater;

    }
}