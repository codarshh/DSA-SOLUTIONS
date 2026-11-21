// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         int left = 0;
//         int right = n-1;
//         int[] ans = new int[2];
//         int sum;

//         while(left<right){
//             sum = nums[left]+nums[right];
//             if(sum==target){
//                 ans[0]=left;
//                 ans[1]=right;
//                 return ans;
//             }
//             else if(sum>target){
//                 right--;
//             }
//             else{
//                 left++;
//             }
//         }
//         return ans;
//     }
// }


// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;
//         int left = 0;
//         int right = n - 1;

//         while (left < right) {
//             int sum = numbers[left] + numbers[right];

//             if (sum == target) {
//                 return new int[]{left + 1, right + 1};
//             } else if (sum > target) {
//                 right--;
//             } else {
//                 left++;
//                 return new int[]{-1, -1};
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {
                return new int[]{arr[left][1], arr[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}