class Solution {
    // -4 -1 -1 0 1 2 
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(i-1>=0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -(nums[i]);
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    result.add(List.of(-(target),nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < n && nums[left] == nums[left-1]){
                        left++;
                    }
                }else if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
