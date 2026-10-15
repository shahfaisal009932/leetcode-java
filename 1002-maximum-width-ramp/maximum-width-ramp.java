class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] minFrL = new int[n];
        int[] maxFrR = new int[n];
        minFrL[0] = nums[0];
        maxFrR[n-1] = nums[n-1];

        for(int i=1; i<n; i++){
            minFrL[i] = Math.min(minFrL[i-1],nums[i]);
        }

        for(int i=n-2; i>=0; i--){
            maxFrR[i] = Math.max(maxFrR[i+1],nums[i]);
        }
        int i=0;
        int j=0;
        int width = 0;

        while(j<n){
            if(minFrL[i]<=maxFrR[j]){
                width = Math.max(width, j-i);
                j++;
            }else{
                i++;
            }
        }
        return width;
        
    }
}