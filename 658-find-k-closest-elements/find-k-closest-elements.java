class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int val : arr){
            int diff = Math.abs(val - x);
            pq.add(new Pair(val, diff));
        }

            List<Integer> ans = new ArrayList<>();
            int cnt = 0;

            while(cnt<k){
                Pair rem = pq.remove();
                ans.add(rem.num);
                cnt++;
            }
            Collections.sort(ans);
        
        return ans;
    }
}
class Pair implements Comparable<Pair>{
    int num;
    int diff;

    Pair(int num, int diff){
        this.num = num;
        this.diff = diff;
    }
    public int compareTo(Pair o){
        if(this.diff == o.diff){
            return this.num - o.num;
        }
        return this.diff - o.diff;
    }

}