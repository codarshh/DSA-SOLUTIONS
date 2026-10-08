class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder ans = new StringBuilder();

        while (true) {
            int max = 0;
            char ch = 0;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    ch = (char) i;
                }
            }
            if (max == 0)
                break;
            for (int i = 0; i < max; i++) {
                ans.append(ch);
            }
            freq[ch] = 0;
        }
        return ans.toString();
    }
}