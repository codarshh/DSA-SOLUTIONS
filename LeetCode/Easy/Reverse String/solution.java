class Solution {
    public void reverseString(char[] s) {
        int hi = s.length-1;
        int lo = 0;

        while(lo<hi){
            char temp = s[lo] ;
            s[lo]=s[hi];
            s[hi]=temp;
            lo++;
            hi--;
        }
    }
}