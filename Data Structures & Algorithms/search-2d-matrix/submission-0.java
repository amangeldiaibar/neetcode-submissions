class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int l = -1;
        int r = n*m;
        while(l+1<r){
            int mid = l + (r-l)/2;
            if(matrix[mid/m][mid%m]<target){
                l = mid;
            }else{
                r = mid;
            }
        }
        if(r == n*m || matrix[r/m][r%m] != target) return false;
        return true;
    }
}
