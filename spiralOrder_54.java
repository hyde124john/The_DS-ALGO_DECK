class spiralOrder_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        List<Integer> ans = new ArrayList<>();
        while(top <= bottom && left <= right){
            //right
            for(int i = left; i <= right; i ++)
                ans.add(matrix[top][i]);
            top ++;
            //bottom
            for(int i = top; i <= bottom; i ++)
                ans.add(matrix[i][right]);
            right --;
            //left
            if(top <= bottom){
                for(int i = right; i >= left; i --)
                    ans.add(matrix[bottom][i]);
                bottom --;
            }
            //top
            if(left <= right){
                for(int i = bottom; i >= top; i --)
                    ans.add(matrix[i][left]);
                left ++;
            }
        }
        return ans;
    }
}
