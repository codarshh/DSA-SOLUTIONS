// class Solution {
//     public int mySqrt(int n) {
//         int root = -1;
    
//         for(int i = 1 ;i<=n/2;i++){
//             if(i*i > n) break;
//             root = i;
//         }
//         return root;         
//     }
// }

class Solution {
    public int mySqrt(int n) {
        if (n < 2) {
            return n;
        }

        int low = 1;
        int high = n / 2;
        int root = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid <= n) {
                root = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return root;
    }
}
