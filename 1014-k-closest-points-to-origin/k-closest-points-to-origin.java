class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int[] point : points){
            int dist = point[0]*point[0]+point[1]*point[1];
            int xCord = point[0];
            int yCord = point[1];

            pq.add(new Pair(xCord, yCord, dist));

            if(pq.size()>k){
                pq.remove();
            }
        }

        int[][] ans = new int[k][2];
        int idx = 0;
        while(pq.size()>0){
            Pair rem = pq.remove();
            ans[idx][0] = rem.x;
            ans[idx][1] = rem.y;
            idx++;
        }
        return ans;
        
    }
}
class Pair implements Comparable<Pair>{
    int x;
    int y;
    int dist;
Pair(int x, int y, int dist){
    this.x = x;
    this.y = y;
    this.dist = dist;
}
public int compareTo(Pair o){
    return o.dist - this.dist;
}
}