class Solution {
    public int minRotations(String s) {
        int curr = 0;
        int total = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            int next = s.charAt(i)-'0';
            int diff;
            if(curr > next){
                diff = curr - next;
            }else{
                diff = next - curr;
            }
            int rot;
            if(diff < 10-diff){
                rot = diff;
            }else{
                rot = 10-diff;
            }
            total = total+rot;
            curr = next;
        }
        return total;
    }
}