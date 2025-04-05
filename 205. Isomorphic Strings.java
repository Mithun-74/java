class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length(); int m = t.length();
        if(n!=m) return false;
        HashMap<Character,Character> maps = new HashMap<>();
        HashMap<Character,Character> mapt = new HashMap<>();
        
        for(int i=0;i<n;i++){
           char chs = s.charAt(i);
           char cht = t.charAt(i);

           if(maps.containsKey(chs) && maps.get(chs)!=cht) return false;
           if(mapt.containsKey(cht) && mapt.get(cht)!=chs) return false;

           maps.put(chs,cht);
           mapt.put(cht,chs);
        }
        return true;
    }
}
