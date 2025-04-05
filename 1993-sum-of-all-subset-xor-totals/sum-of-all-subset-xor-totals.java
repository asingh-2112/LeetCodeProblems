class Solution {
    public int subsetXORSum(int[] nums) {
        return XORSum(nums,0,0);
    }
    public int XORSum(int[] nums,int index, int curr){
        if(index==nums.length) return curr;
        int withElement=XORSum(nums,index+1,curr^nums[index]);
        int withoutElement=XORSum(nums,index+1,curr);
        return withElement+withoutElement;
    }
}