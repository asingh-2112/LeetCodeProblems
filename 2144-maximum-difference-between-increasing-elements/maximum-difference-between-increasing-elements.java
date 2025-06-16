class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int small=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>small){
                ans=Math.max(nums[i]-small,ans);
            }
            else{
                small=Math.min(small,nums[i]);
            }
        }
        return ans;
    }
}