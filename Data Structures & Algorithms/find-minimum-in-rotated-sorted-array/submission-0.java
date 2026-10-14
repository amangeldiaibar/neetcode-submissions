class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = -1;
        int r = n;
        while(l+1<r){
            int m = l + (r-l)/2;
            if(nums[m]>nums[n-1]){
                l = m;
            }else{
                r = m;
            }
        }
        return nums[r];
    }
}
