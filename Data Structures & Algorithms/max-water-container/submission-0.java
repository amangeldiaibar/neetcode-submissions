class Solution {
    public int maxArea(int[] heights) {
        int result = Integer.MIN_VALUE;
        int n = heights.length;
        int l = 0;
        int r = n - 1;
        while(l<r){
            int water = Math.min(heights[l],heights[r])*(r-l);// 7 36 15 28 12 10 2
            result = Math.max(result,water);
            if(heights[r]>heights[l]){
                l++;
            }else{
                r--;
            }
        }
        return result;
    }
}
/*
1,7,2,5,4,7,3,6
0 1 2 3 4 5 6 7
*/
