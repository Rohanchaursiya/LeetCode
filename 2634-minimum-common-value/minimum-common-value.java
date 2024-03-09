class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        Arrays.sort(nums2);
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i]))return nums2[i];
        }
        return -1;
    }
}