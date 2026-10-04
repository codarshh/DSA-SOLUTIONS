class Solution {
    public int thirdMax(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        boolean hasLargest = false;
        boolean hasSecondLargest = false;
        boolean hasThirdLargest = false;

        for(int i = 0; i < arr.length; i++){
            if((hasLargest && arr[i] == largest) ||
               (hasSecondLargest && arr[i] == secondLargest) ||
               (hasThirdLargest && arr[i] == thirdLargest)){
                continue;
            }

            if(!hasLargest || arr[i] > largest){
                thirdLargest = secondLargest;
                hasThirdLargest = hasSecondLargest;

                secondLargest = largest;
                hasSecondLargest = hasLargest;

                largest = arr[i];
                hasLargest = true;
            }
            else if(!hasSecondLargest || arr[i] > secondLargest){
                thirdLargest = secondLargest;
                hasThirdLargest = hasSecondLargest;

                secondLargest = arr[i];
                hasSecondLargest = true;
            }
            else if(!hasThirdLargest || arr[i] > thirdLargest){
                thirdLargest = arr[i];
                hasThirdLargest = true;
            }
        }

        if(hasThirdLargest){
            return thirdLargest;
        }

        return largest;
    }
}