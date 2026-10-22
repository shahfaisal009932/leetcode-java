class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int no : nums){
            if(hs.contains(no)){
                return true;
            }
            hs.add(no);
        }
        return false;
    }
}