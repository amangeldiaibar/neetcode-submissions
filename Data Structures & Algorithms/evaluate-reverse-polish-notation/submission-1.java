class Solution {// 4 13 5 / +
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = tokens.length;
        for(int i = 0;i < n;i++){
            if(tokens[i].equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(tokens[i].equals("-")){
                int minus = stack.pop();
                stack.push(stack.pop()-minus);
            }else if(tokens[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(tokens[i].equals("/")){
                int divide = stack.pop();
                stack.push(stack.pop()/divide);
            }else{
                stack.push(Integer.parseInt(tokens[i])); // 4 13 5
            }
        }
        return stack.pop();
    }
}
