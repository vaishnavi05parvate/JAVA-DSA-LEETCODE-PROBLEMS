class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
      int []brr = new int[n];
        int k=0,m=1;
        for (int i = 0; i <n; i++) {

                if(nums[i]>0){

                    brr[k]=nums[i];
                    k+=2;


            }
                else{
                    brr[m]=nums[i];
                    m+=2;
                }


        }
        
       return brr;
    }
}