class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || nums[i] != nums[i-1]){
                int l = i+1;
                int r = nums.length-1;
                int tar = 0-nums[i];

                while(l<r){
                    if(nums[l]+nums[r]==tar){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        // if(!ans.contains(temp)){
                            ans.add(temp);
                            while(nums[l]==nums[l+1] && l+1<r){
                                l++;
                            }
                            l++;
                            while(nums[r]==nums[r-1] && l<r){
                                r--;
                            }
                            r--;
                        // }
                    }else if(nums[l]+nums[r]>tar){
                        while(nums[r]==nums[r-1] && r-1>i && r-1>l){
                            r--;
                        }
                        r--;
                    }else{
                        while(nums[l]==nums[l+1] && l+1<nums.length-1 && l<r){
                            l++;
                        }
                        l++;
                    }
                }
            }
        }
        return ans;
        
    }
}