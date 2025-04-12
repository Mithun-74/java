class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
           int val = hm.get(s.charAt(i));
           if(i+1<n && val < hm.get(s.charAt(i+1))){
               sum -=val;
           }
           else sum +=val;
        }

        return sum;
    }
}
