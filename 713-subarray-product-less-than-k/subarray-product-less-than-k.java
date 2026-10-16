class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){return 0;}
        int count = 0;
        int left = 0;
        int pp = 1;

        for(int right=0; right<nums.length; right++){
            pp *= nums[right];

            while(pp >= k){
                pp /= nums[left];
                left++;
            }

            count += (right - left + 1);
        }
        return count;
    }
}