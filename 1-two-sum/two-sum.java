class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=1;
        int[] ans = new int[2];
        while(i<nums.length && j<nums.length){
            if(nums[i]+nums[j]==target){
                ans[0] = i;
                ans[1] = j;
                return ans;
            }

            if(j==nums.length-1){
                i++;
                j=i;
            }
            j++;
        }
        return ans;
    }
}