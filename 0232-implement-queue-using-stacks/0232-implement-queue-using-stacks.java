class MyQueue {
    Stack <Integer> ip;
    Stack <Integer> op;

    public MyQueue() {
        ip = new Stack<>();
        op = new Stack<>();
    }
    
    public void push(int x) {
        ip.push(x);
    }
    
    public int pop() {
        
        if (op.size() == 0){
        while(ip.size() != 0){
            op.push(ip.pop());
        }
        }

        return op.pop();
    }
    
    public int peek() {
    
        if (op.size() == 0){
        while(ip.size() !=0){
            op.push(ip.pop());
        }
        }

        return op.peek();
    }
    
    public boolean empty() {
        if(ip.size() == 0 && op.size() == 0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 **/