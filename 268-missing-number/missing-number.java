class Solution {
    public int missingNumber(int[] arr) {
        int xor1=0;
        int xor2=0;
        for(int i=0;i<=arr.length;i++){
            xor1^=i;
        }
        for(int i:arr){
            xor2^=i;
        }
        return xor1^xor2;
    }
}