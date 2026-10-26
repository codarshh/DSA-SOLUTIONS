class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        if (n == 2) return -1;
        char min = s.charAt(0);
        char max = s.charAt(0);
        
        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);
            if (ch < min) min = ch;
            if (ch > max) max = ch;
        }
        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }
        return 3;
    }
}




// class Solution {
//     public int minOperations(String s) {
//         int n = s.length();
//         boolean sorted = true;
//         for (int i = 1; i < n; i++) {
//             if (s.charAt(i) < s.charAt(i - 1)) {
//                 sorted = false;
//                 break;
//             }
//         }
//         if (sorted) {
//             return 0;
//         }
//         if (n == 2) {
//             return -1;
//         }

//         char min = s.charAt(0);
//         char max = s.charAt(0);

//         int minIndex = 0;
//         int maxIndex = 0;

//         for (int i = 1; i < n; i++) {
//             char ch = s.charAt(i);

//             if (ch < min) {
//                 min = ch;
//                 minIndex = i;
//             }

//             if (ch > max) {
//                 max = ch;
//                 maxIndex = i;
//             }
//         }

//         if (minIndex == 0 || maxIndex == n - 1) {
//             return 1;
//         }

//         if (minIndex > 0 && minIndex < n - 1) {
//             return 2;
//         }

//         if (maxIndex > 0 && maxIndex < n - 1) {
//             return 2;
//         }

//         return 3;
//     }
// }

