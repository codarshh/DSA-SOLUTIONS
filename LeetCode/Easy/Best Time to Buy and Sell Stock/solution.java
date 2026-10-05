// class Solution {
//     public int maxProfit(int[] arr) {
//         int n = arr.length;
//         int buyTime = arr[0];
//         int sellTime=-1;
//         int profit;
//         for(int i=0;i<n;i++){
//             if(arr[i]<buyTime){
//                 buyTime = arr[i];
//             }
//             if(arr[n-1]==buyTime) return 0;
//         }
//         for(int i=buyTime;i<n;i++){
//             if(arr[i]>sellTime){
//                 sellTime = arr[i];
//             }
//         }
//             return profit = sellTime-buyTime;
//     }
// }


class Solution {
    public int maxProfit(int[] arr) {
        int buy = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < buy) {
                buy = arr[i];
            } else {
                profit = Math.max(profit, arr[i] - buy);
            }
        }
        return profit;
    }
}