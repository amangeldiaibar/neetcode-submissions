class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int result = 0;
        for(int i = 0;i < nums.length;i++){
            int num = nums[i];
            if(!set.contains(num-1)){
                int size = 0;
                while(set.contains(num+size)){
                    size++;
                    result = Math.max(result,size);
                }
            }
        }
        return result;
    }
}
