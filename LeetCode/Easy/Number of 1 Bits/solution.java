class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        for(char ch:str.toCharArray()){
            if(ch=='1') count++;
        }
        return count;
        
    }
}