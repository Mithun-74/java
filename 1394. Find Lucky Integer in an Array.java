class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int value = -1;
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(int i:arr){
            if(i==hm.get(i)) 
            value = Math.max(value,i);
        }

        return value;
    }
}
