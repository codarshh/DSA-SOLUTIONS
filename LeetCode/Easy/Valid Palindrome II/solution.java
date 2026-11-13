class Solution {
    public boolean validPalindrome(String s) {

        int i=0;
        int j = s.length()-1;

       while(i<j){
        if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else{
                return isPal(s,i+1,j) || isPal(s, i, j - 1);
            }
        }
        return true;
    }

    private boolean isPal(String str, int left ,int right){
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;

            }
            left++;
            right--;
        }
           return true;
        }
    }

