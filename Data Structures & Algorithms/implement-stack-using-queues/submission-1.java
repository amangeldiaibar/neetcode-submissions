class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }
    //   1 2 3
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        for(int i = 0;i < queue.size()-1;i++){
            queue.add(queue.poll());
        }
        return queue.poll();
    }
    //  1 2 3
    public int top() {
        int res = 0;
        for(int i = 0;i < queue.size();i++){
            if(i == queue.size()-1){
                res = queue.poll();
                queue.add(res);
                break;
            }
            queue.add(queue.poll());
        }
        return res;
    }
    
    public boolean empty() {
        if(queue.size() == 0)return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */