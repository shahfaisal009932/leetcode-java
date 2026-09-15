class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for(int i=0; i<arr.length; i++){
            if(i<nums1.length){
                arr[i] = nums1[i];
            }else{
                arr[i] = nums2[i-nums1.length];
            }
        }
        Arrays.sort(arr);
        double ans = 0.0;
        if(arr.length%2==0){
            ans = arr[(arr.length/2)-1] + arr[arr.length/2];
            ans = ans/2;
        }else{
            ans = arr[arr.length/2];
        }
        return ans;
        
    }
}