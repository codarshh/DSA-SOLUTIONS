class Solution {
    public void generate(int n, int left, int right, String str, List<String> ans) {
        if (right == n) {
            ans.add(str);
            return;
        }
    if (left < n)
   generate(n, left + 1, right, str + "(", ans);
    if (right < left)
     generate(n, left, right + 1, str + ")", ans);
    }
      public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        return ans;
    }
}