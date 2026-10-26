class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        queue.add(s);
        visited.add(s);
        boolean found = false;
        
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            if (isValid(curr)) {
                result.add(curr);
                found = true;
            }
            if (found) {
                continue;
            }
            for (int i = 0; i < curr.length(); i++) {
                if (curr.charAt(i) != '(' && curr.charAt(i) != ')') {
                    continue;
                }
                String left = curr.substring(0, i);
                String right = curr.substring(i + 1);
                String next = left + right;
                if (!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);
                }
            }
        }   
        return result;
    }
    private boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}