// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int n = nums.length;
//         int maxLength = 0;
        
//         for (int i = 0; i < n; i++) {
//             int zeroCount = 0;
//             for (int j = i; j < n; j++) {
//                 if (nums[j] == 0) { 
//                     zeroCount++; 
//                 }
//                 if (zeroCount > k) {
//                     break;
//                 }
//                 maxLength = Math.max(maxLength, j - i + 1);
//             }
//         }
//         return maxLength;
//     }
// }


class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
