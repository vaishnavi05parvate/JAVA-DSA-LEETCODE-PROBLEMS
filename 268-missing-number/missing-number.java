class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,total=0,count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            count++;
        }
        for(int i=1;i<=count;i++){
            total+=i;
        }
        return total-sum;
    }
}