class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 0;
        int n = prices.length;
        int result = 0;
        int leftMin = prices[0];
        while(l < n){
            while(r+1 < n && prices[r] <= prices[r+1]){
                r++;
            }
            leftMin = Math.min(leftMin,prices[l]);
            result = Math.max(result,prices[r] - leftMin);
            r++;
            l = r;
        }
        return result;
    }
}
