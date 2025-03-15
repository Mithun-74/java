class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        int n = a.length;
        int m = b.length;
        int i=0,j=0;
        while(i<n){
            set.add(a[i]);
            i++;
        }
        
        while(j<m){
            set.add(b[j]);
            j++;
        }
        
        ArrayList arr = new ArrayList<>();
        arr.addAll(set);
        Collections.sort(arr);
        
        return arr;
    }
}
