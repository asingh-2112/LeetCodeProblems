class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==2) c++;
        }
        if(c==0) return 0;
        int i=0;
        while(i<nums.length){
            int j=3;
            while(i<nums.length && j>0){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==1) c--;
                j--;
                i++;
            }
            if(c==0) break;
        }
        if(i%3==0) return i/3;
        else return (i/3)+1;
    }
}