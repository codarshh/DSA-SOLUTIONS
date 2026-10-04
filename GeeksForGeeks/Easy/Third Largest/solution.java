class Solution {
    public int thirdLargest(List<Integer> arr) {
        int n = arr.size();
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int tl = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr.get(i) > l){
                tl = sl;
                sl = l;
                l = arr.get(i);
            }
            else if(arr.get(i) >= sl ){
                tl = sl;
                sl = arr.get(i);
            }
            else if(arr.get(i) >= tl ){
                tl = arr.get(i);
            }
        }

        if(tl == Integer.MIN_VALUE){
            return -1;
        }

        return tl;
    }
}