class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(String operation : operations){
            if(operation.equals("+")){
                int prev = stack.pop();
                int prev2 = stack.pop();
                stack.push(prev2);
                stack.push(prev);
                stack.push(prev+prev2);
            
                continue;
            }
            if(operation.equals("C")){
                stack.pop();
                continue;
            }
            if(operation.equals("D")){
                int prev = stack.pop();
                stack.push(prev);
                stack.push(prev*2);
                continue;
            }
            int op = Integer.parseInt(operation);
            stack.push(op);
        }
        for(int num : stack){
            sum +=num;
        }
        return sum;
    }
}