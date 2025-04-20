class Solution {
    public int numRabbits(int[] answers) {
        int[] arr=new int[1001];
        int ans=0;
        for(int i:answers){
            if(i==0) ans++;
            else{
                if(arr[i]==0){
                    ans+=i+1;
                }
                arr[i]++;
                if(arr[i]==i+1){
                    arr[i]=0;
                }
            }
        }
        return ans;
    }
}