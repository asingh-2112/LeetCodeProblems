class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans=0;
        int count=0;
        int maxElement = Arrays.stream(nums).max().getAsInt();
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==maxElement) count++;
            while(count==k){
                if(maxElement==nums[i]){
                    count--;
                }
                i++;
            }
            ans+=i;
        }
        return ans;
    }
}