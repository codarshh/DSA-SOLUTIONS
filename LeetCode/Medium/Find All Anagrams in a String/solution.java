class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int m = p.length(), n = s.length();

        if (m > n) return ans;

        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        String sp = new String(arr);

        for (int i = 0; i + m <= n; i++) {
            char[] brr = s.substring(i, i + m).toCharArray();
            Arrays.sort(brr);

            if (sp.equals(new String(brr))) {
                ans.add(i);
            }
        }
        return ans;
    }
}