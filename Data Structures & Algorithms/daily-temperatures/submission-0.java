class Solution {
    public int[] dailyTemperatures(int[] temperatures){
        int n = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[n];
        stack.push(0);
        // [1,0,1,2,1
        // stack = {1,2,3,4}
        for(int i = 1;i < n;i++){
            while(!stack.isEmpty()&& temperatures[i]>temperatures[stack.peek()]){
                int pop = stack.pop();
                result[pop] = i-pop;
            }
            stack.push(i);
        }
        return result;
    }
}/*
38 30 36 35 40
 1  2  5  

1 0 0 2 1
*/
