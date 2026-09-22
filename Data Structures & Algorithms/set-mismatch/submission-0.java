class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int num1 = n*(n+1)/2;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        int element = 0;
        for(int num : nums){
            if(set.contains(num)) element = num;
            set.add(num);
        }
        for(int i : set){
            sum += i;
        }
        return new int[]{element,num1-sum};

    }
}
// 1 2 3 4