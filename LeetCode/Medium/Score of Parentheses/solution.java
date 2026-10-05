class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int layer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                layer++;
            } else {
                layer--;
                if (s.charAt(i - 1) == '(') {
                    int add = 1;
                    for (int j = 0; j < layer; j++) {
                        add = add * 2;
                    }
                    score = score + add;
                }
            }
        }
        return score;
    }
}