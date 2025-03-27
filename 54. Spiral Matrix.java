class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0; int but = n-1; int left = 0; int right = m-1;
        
        List<Integer> res =  new ArrayList<>();

        while(top<=but && left<=right){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=but;i++){
                res.add(matrix[i][right]);
            }
            right--;
            
            if(top<=but){
            for(int i=right;i>=left;i--){
                res.add(matrix[but][i]);
            }
            but--;
            }

            if(left<=right){
            for(int i=but;i>=top;i--){
                res.add(matrix[i][left]);
            }
            left++;
            }
        }
        return res;
    }
}
