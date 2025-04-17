class Solution {
    public int countPairs(int[] nums, int k) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int count=0;
        for(int i=1;i<=100;i++){
            if(map.containsKey(i)){
                ArrayList<Integer> al=map.get(i);
                for(int j=0;j<al.size();j++){
                    for(int l=j+1;l<al.size();l++){
                        if((al.get(j)*al.get(l))%k==0){
                            // System.out.print(al.get(j)+" ");
                            // System.out.println(al.get(l));
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}