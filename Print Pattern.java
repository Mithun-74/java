class Solution {
    
    public List<Integer> pattern(int n) {
        List<Integer> result = new ArrayList<>();
        buildPattern(n, n, result, false);
        return result;
    }

    private void buildPattern(int current, int original, List<Integer> result, boolean increasing) {
        result.add(current);

        if (current == original && increasing) return;

        if (current <= 0) {
            buildPattern(current + 5, original, result, true);
        } else if (!increasing) {
            buildPattern(current - 5, original, result, false);
        } else {
            buildPattern(current + 5, original, result, true);
        }
    }
}
