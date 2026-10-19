class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findSearch(nums,target,true);
        int last = findSearch(nums,target,false);
        return new int[]{first,last};
    }
    public int findSearch(int[] nums, int target, boolean find){
        int lo = 0;
        int hi = nums.length-1;
        int ans = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(nums[mid]==target){
                ans = mid;
                if(find){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else if(nums[mid]<target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
}