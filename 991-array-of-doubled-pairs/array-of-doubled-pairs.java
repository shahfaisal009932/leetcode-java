class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Integer[] ar = new Integer[arr.length];
        for(int i =0; i<arr.length; i++){
            ar[i] = arr[i];
        }
        Arrays.sort(ar, (a,b)->{
            return Math.abs(a) - Math.abs(b);
            });

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int val : ar){
            hm.put(val,hm.getOrDefault(val,0)+1);
        }

        for(int key : ar){
            if(hm.get(key)==0){
                continue;
            }
            if(hm.getOrDefault(2*key,0) == 0){
                return false;
            }
            hm.put(key, hm.get(key)-1);
           

            hm.put(2*key,hm.get(2*key)-1);
           
        }

        return true;
        
    }
}