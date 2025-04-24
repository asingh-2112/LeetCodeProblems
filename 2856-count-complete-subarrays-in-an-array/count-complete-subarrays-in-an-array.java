class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int res=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int cnt=set.size();
        HashMap<Integer,Integer> map=new HashMap<>();
        int right=0;
        int dis=0;

        for(int left=0;left<nums.length;left++){
            if(left>0){
                int t=nums[left-1];
                if(map.get(t)==1){
                    map.remove(t);
                    dis--;
                }
                else{
                    map.put(t,map.get(t)-1);
                }
            }
            while(right<nums.length && dis<cnt){
                if(!map.containsKey(nums[right])){
                    dis++;
                }
                map.put(nums[right],map.getOrDefault(nums[right],0)+1);
                right++;
            }
            if(dis==cnt){
                res+=(nums.length-right+1);
            }
        }
        return res;
    }
}