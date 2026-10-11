class Solution {
    public int[] twoSum(int[] arr, int target) {
      int i = 0;
      int j = arr.length - 1;
      int[] brr = new int[2];
          while(i < j){
        if(arr[i] + arr[j] < target){
            i++;
    }else if(arr[i] + arr[j] > target) {
        j--;
    }
    else{
        brr[0]=i+1;
        brr[1]=j+1;
        return brr;
        }
     }
        return null;
    }
}

