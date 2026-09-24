class Solution {
    // Time: O(n) Space: O(n)
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int size = 0;
                while(set.contains(num+size)){
                    size++;
                }
                result = Math.max(result,size);
            }
        }
        return result;
    }
}
