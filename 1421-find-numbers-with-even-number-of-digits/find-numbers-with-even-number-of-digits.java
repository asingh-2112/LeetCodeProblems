class Solution {
    //100000
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int n:nums){
            if((n>=10 && n<=99) || (n>=1000 && n<=9999) || (n>=100000)) ans++;
        }
        return ans;
    }
}