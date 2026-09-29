class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int size = 0;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val); // -2 0 -3
        // -2 -2 -3
        if(size == 0){
            minStack.push(val);
        }else{
            minStack.push(Math.min(minStack.peek(),val));
        }
        size++;
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        size--;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
