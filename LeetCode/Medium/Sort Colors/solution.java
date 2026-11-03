class Solution {
    public void sortColors(int[] nums) {
        // ArrayList<Integer> ans = new ArrayList <>();
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         ans.add(0);
        //     }
        // } 
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         ans.add(1);
        //     }
        // } 
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==2){
        //         ans.add(2);
        //     }
        // } 
        // for(int i =0;i<nums.length;i++){
        //     nums[i] = ans.get(i);
        // } 


        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                nums[mid] = nums[low];
                nums[low] = 0;
                mid++;
                low++;
            } 
            else if (nums[mid] == 2) {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            } 
            else { 
                mid++;
            }
        }

    }
}
 
  
   
    
     
      
       
        
         
          
           
            
             
              
               
                
                 
                  
                   
                    
                     
                      
                        
                          
                           
                             
                              
                               
                                
                                 
                                  
                                   
                                    
                                     

                                       
                                        
