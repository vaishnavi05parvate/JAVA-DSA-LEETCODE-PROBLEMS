// class Solution {
//     public int firstMissingPositive(int[] nums) {
//          Arrays.sort(nums);
//          int ans=1,count=1;
//          for(int i=0;i<nums.length;i++){
//               if(nums[i]>0){  
//                 if(count==nums[i]){
//                     count++;
//                     ans=count;
                
//                 }
            
//               }
              
//          }
//          return ans;
//     }
// }
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count) {
                count++;
            }
        }

        return count;
    }
}