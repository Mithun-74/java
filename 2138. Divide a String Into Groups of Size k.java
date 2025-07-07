class Solution {
    public String[] divideString(String s, int k, char fill) {
        while (s.length() % k != 0) {
            s += fill;
        }

        int n = s.length();
        String[] result = new String[n / k];
        int index = 0;

        for (int i = 0; i < n; i += k) {
            result[index++] = s.substring(i, i + k);
        }
        return result;
    }
}
