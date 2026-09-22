class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        int k = nums.length;
        while(slow<nums.length && fast < nums.length){
            if(nums[fast] == val){
                nums[fast] = 0;
                fast++;
                k--;
                continue;
            }
            nums[slow] = nums[fast];
            slow++;
            fast++;
        }
        return k;
    }
}
// 1 2 2 3 4 
// 1 3 4