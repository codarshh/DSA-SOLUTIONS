class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int windowSum = 0;
        for(int i = 0 ;i < k;i++){ 
            windowSum += arr[i];
        }
        int maxAns = windowSum;
        for(int j=k; j<n; j++){
            windowSum += arr[j]; 
            windowSum -= arr[j-k];
            maxAns = Math.max(maxAns, windowSum);
        }
        return maxAns;
    }
}