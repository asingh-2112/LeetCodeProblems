class Solution {
    public long countSubarrays(int[] nums, long k) {
        int i=0,j=0;
        long score=0;
        long res=0;
        while(j<nums.length){
            score+=nums[j];
            while(i<=j && score*(j-i+1)>=k){
                score-=nums[i];
                i++;
            }
            res+=(long)j-i+1;
            j++;
        }
        return res;
    }
}