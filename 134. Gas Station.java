class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int gassum=Arrays.stream(gas).sum();
       int costsum=Arrays.stream(cost).sum();
       if(gassum<costsum) return -1;
       int n = gas.length;
       int startindex = 0;
       int currentgas = 0;
       for(int i=0;i<n;i++){
           currentgas += gas[i]-cost[i];

           if(currentgas<0){
              startindex=i+1;
              currentgas = 0;
           }
        }
       return startindex;
    }
}
