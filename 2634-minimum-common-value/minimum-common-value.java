class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int i=0,j=0;
        while(i<l1&&j<l2){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                return nums1[i];
            }
        }
        return -1;
    }
}