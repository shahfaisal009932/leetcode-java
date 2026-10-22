class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int count = Integer.MAX_VALUE;
        int sum = 0;
        for(int j=0; j<nums.length; j++){
            sum += nums[j];
            while(sum>=target){
                count = Math.min(count,j-i+1);
                sum -= nums[i];
                i++;
            }
        }
        if(count==Integer.MAX_VALUE){
            return 0;
        }else{
            return count;
        }
        
    }
}