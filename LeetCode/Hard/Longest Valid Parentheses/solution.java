class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLen = Math.max(maxLen, 2 * right);
            }
            else if (right > left) {
                left = 0;
                right = 0;
            }
        }
        left = 0;
        right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLen = Math.max(maxLen, 2 * left);
            }
            else if (left > right) {
                left = 0;
                right = 0;
            }
        }
        return maxLen;
    }
}




// class Solution {
//     private boolean isValid(String s, int left, int right) {
//         int balance = 0;
//         for (int i = left; i <= right; i++) {
//             char c = s.charAt(i);
//             if (c == '(') {
//                 balance++;
//             } else { 
//                 balance--;
//             }
//             if (balance < 0) {
//                 return false;
//             }
//         }
//         return balance == 0;
//     }
//     public int longestValidParentheses(String s) {
//         int n = s.length();
//         int maxLen = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 if ((j - i + 1) % 2 != 0) {
//                     continue;
//                 }

//                 if (isValid(s, i, j)) {
//                     int len = j - i + 1;
//                     if (len > maxLen) {
//                         maxLen = len;
//                     }
//                 }
//             }
//         }
//         return maxLen;
//     }
// }



// class Solution {
//     public int longestValidParentheses(String s) {
//         int n = s.length();
//         int maxLen = 0;
//         for (int i = 0; i < n; i++) {
//             int balance = 0;
//             for (int j = i; j < n; j++) {
//                 char c = s.charAt(j);
//                 if (c == '(') {
//                     balance++;
//                 } else {
//                     balance--;
//                 }
//                 if (balance < 0) {
//                     break;
//                 }
//                 if (balance == 0) {
//                     int len = j - i + 1;
//                     maxLen = Math.max(maxLen, len);
//                 }
//             }
//         }
//         return maxLen;
//     }
// }