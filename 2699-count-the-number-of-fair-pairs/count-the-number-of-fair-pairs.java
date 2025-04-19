class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLowerBound(nums,upper+1)- countLowerBound(nums,lower);
    }
    public long countLowerBound(int[] nums, int lower){
        int i=0;
        int j=nums.length-1;
        long count=0;
        while(i<j){
            if((nums[i]+nums[j])<lower){
                count+=(long)(j-i);
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}