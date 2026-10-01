class MyLinkedList {
    static class Node{
        int val;
        Node prev;
        Node next;
        public Node(){

        }
        public Node(int val){
            this.val = val;
        }
        public Node(Node prev,int val,Node next){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
    Node tail;
    Node head;
    int size;
    public MyLinkedList() {
        tail = new Node(head,0,null);
        head = new Node(null,0,tail);
        size = 0;
    }
    
    public int get(int index) {
        if(index<0 || index >= size) return -1;
        Node cur = head.next;
        for(int i = 0;i < index;i++){
            cur = cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size || index <0) return;
        Node pred = head;
        for(int i = 0;i<index;i++){
            pred = pred.next;
        }
        Node succ = pred.next;
        Node newNode = new Node(pred,val,succ);
        pred.next = newNode;
        succ.prev = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>= size) return;
        Node cur = head.next;
        for(int i = 0;i < index;i++){
            cur = cur.next;
        }
        Node pred = cur.prev;
        Node succ = cur.next;
        pred.next = succ;
        succ.prev = pred;
        size--;
/*
1 - values
0 - index
delete(0) 
*/
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */