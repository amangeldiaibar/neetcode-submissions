class BrowserHistory {
    static class Node{
        String val;
        Node prev;
        Node next;
        public Node(){

        }
        public Node(String val){
            this.val = val;
        }
    }
    Node cur;
    public BrowserHistory(String homepage) {
        cur = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        cur.next = newNode;
        newNode.prev = cur;
        cur = newNode;
    }
    
    public String back(int steps) {
        for(int i = 0;i < steps && cur.prev != null;i++){
            cur = cur.prev;
        }
        return cur.val;
    }
    
    public String forward(int steps) {
        for(int i = 0;i < steps && cur.next != null;i++){
            cur = cur.next;
        }
        return cur.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */