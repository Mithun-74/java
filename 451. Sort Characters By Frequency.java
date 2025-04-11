import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(hm.entrySet());

  
        StringBuilder str = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            str.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return str.toString();
    }
}
