class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int cnt = 0;
        for(int num : nums){
            if(num == 1) cnt++;
            if(num == 0){
                cnt = 0;
            }
            result = Math.max(result,cnt);
        }
        return result;
    }
}