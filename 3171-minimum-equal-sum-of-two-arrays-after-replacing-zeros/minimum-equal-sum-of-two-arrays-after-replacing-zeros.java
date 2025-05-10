class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int c1=0,c2=0;
        long s1=0,s2=0;
        int i=0,j=0;
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length){
                if(nums1[i]==0){
                    c1++;
                    nums1[i]=1;
                }
                s1+=(long)nums1[i];
            }
            if(j<nums2.length){
                if(nums2[j]==0){
                    c2++;
                    nums2[j]=1;
                }
                s2+=(long)nums2[j];
            }
            i++;
            j++;
        }
        if((s1<s2 && c1==0) || (s1>s2 && c2==0)) return -1;
        return Math.max(s1,s2);

    }
}