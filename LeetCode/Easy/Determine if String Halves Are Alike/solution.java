class Solution {
    public boolean halvesAreAlike(String s) {
        String vowel = "aeiouAEIOU";
        int count1= 0;
        int count2=0;
        int mid = s.length()/2;

        for(int i = 0;i<mid;i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                count1++;
            }
        }
        for(int j = mid ;j <s.length();j++){
            if(vowel.indexOf(s.charAt(j))!=-1){
                count2++;
            }
        }

        if(count1==count2){
            return true;
        }
        return false;
    }
}