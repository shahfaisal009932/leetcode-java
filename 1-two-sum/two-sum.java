class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int currTar =target - nums[i];
            if(hm.containsKey(currTar)){
                ans[0] = hm.get(currTar);
                ans[1] = i;
                return ans;
            }
            hm.put(nums[i],i);
        }
        return ans;
    }
}