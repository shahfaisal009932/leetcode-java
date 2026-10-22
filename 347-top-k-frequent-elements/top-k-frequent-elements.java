class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(hm.get(b), hm.get(a)));

        for(int num : hm.keySet()){
            pq.offer(num);
        }

        int[] ans = new int[k];

        for(int i=0; i<k; i++){
            ans[i] = pq.poll();
        }

        return ans;
    }
}