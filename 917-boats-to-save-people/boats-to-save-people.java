class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int li = 0;
        int ri = people.length-1;
        int ans = 0;
         while(li<=ri){
            int totalWeight = people[li]+people[ri];
            if(totalWeight <= limit){
                ans++;
                li++;
                ri--;
            }else{
                ans++;
                ri--;
            }
         }
         return ans;
    }
}