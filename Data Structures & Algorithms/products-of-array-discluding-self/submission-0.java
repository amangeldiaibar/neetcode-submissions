class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = 1;
        int n = nums.length;
        int[] result = new int[n];
        int[] sx = new int[n+1];
        sx[n] = 1;
        for(int i = n-1;i >= 0;i--){
            sx[i] = sx[i+1]*nums[i];
        }
        for(int i = 0;i<n;i++){
            result[i] = l*sx[i+1];
            l *= nums[i];
        }
        return result;
    }
}  
