class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = -1;
        int r = n;
        while(l+1< r){
            int m = l + (r-l)/2; // 2 4 3
            if(nums[m]<target){
                l = m; // 2
            }else{
                r = m; // 4
            }
        }
        if(r == n || nums[r] != target) return -1;
        return r;
    }
}
