class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int  k = p.length();
        int[] farr = new int[26];
        for(char ch : p.toCharArray()){
            farr[ch-'a']++;
        }

        int left = 0;

        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            farr[ch-'a']--;

            if(right-left+1>k){
                char c = s.charAt(left);
                farr[c-'a']++;
                left++;
            }

            if(isEmpty(farr)){
                ans.add(left);
            }
        }
        return ans;

    }

    public boolean isEmpty(int[] farr){
        for(int i=0; i<farr.length; i++){
            if(farr[i] != 0){
                return false;
            }
        }
        return true;
    }
}