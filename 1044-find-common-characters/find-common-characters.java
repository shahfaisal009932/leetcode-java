class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int[] common = new int[26];
        
        Arrays.fill(common,Integer.MAX_VALUE);

        for(String word : words){
            int[] temp = new int[26];
            for(char ch : word.toCharArray()){
                temp[ch-'a']++;
            }
            for(int j=0; j<26; j++){
                common[j] = Math.min(common[j],temp[j]);
            }
        }
        
        for(int i=0; i<26; i++){
           int freq = common[i];

           for(int k=0; k<freq; k++){
            String currStr = (char)(i+'a')+"";
            ans.add(currStr);
           }
    }
    return ans;
}
}