class Main {

    public static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) res[k++] = left[i++];
            else res[k++] = right[j++];
        }

        while (i < left.length) res[k++] = left[i++];
        while (j < right.length) res[k++] = right[j++];

        return res;
    }

    public static int[] mergeSort(int[] arr, int s, int e) {
        if (s == e) return new int[]{arr[s]}; // base case: one element

        int m = (s + e) / 2;
        int[] left = mergeSort(arr, s, m);
        int[] right = mergeSort(arr, m + 1, e);

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
