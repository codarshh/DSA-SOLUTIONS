// class Solution {

//     public int lengthOfLongestSubstring(String s) {

//         int left = 0;
//         int max = 0;

//         for (int right = 0; right < s.length(); right++) {
//          char c = s.charAt(right);
//             for (int i = left; i < right; i++) {
//              if (s.charAt(i) == c) {
//              left = i + 1;
//                 break;
//                 }
//             }
//             max = Math.max(max, right - left + 1);
//     }
//      return max;
//     }
// }


class Solution {

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int max = 0;
        int count = 0;
        boolean[] isVisited = new boolean[256];

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            while (isVisited[c]) {
                isVisited[s.charAt(left)] = false;
                left++;
                count--;
            }

            if (!isVisited[c]) {
                isVisited[c] = true;
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}