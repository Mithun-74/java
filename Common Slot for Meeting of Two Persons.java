import java.util.*;

class Solution {
    public int[] commonSlot(List<int[]> a, List<int[]> b, int d) {
        Collections.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
        Collections.sort(b, (x, y) -> Integer.compare(x[0], y[0]));

        int p1 = 0, p2 = 0;

        while (p1 < a.size() && p2 < b.size()) {
            int start = Math.max(a.get(p1)[0], b.get(p2)[0]);
            int end = Math.min(a.get(p1)[1], b.get(p2)[1]);

            if (end - start >= d) {
                return new int[]{start, start + d};
            }

            if (a.get(p1)[1] < b.get(p2)[1]) {
                p1++;
            } else {
                p2++;
            }
        }

        return new int[0]; 
    }
}
