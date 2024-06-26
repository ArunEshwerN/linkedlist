class MinStack {
    Stack<Long> st;
    Long mini;

    public MinStack() {
        st = new Stack<>();
        mini = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long value = Long.valueOf(val);
        
        if (st.isEmpty()) {
            mini = value;
            st.push(value);
        } else {
            if (value < mini) {
                // Push a special value to encode the new minimum
                st.push(2 * value - mini);
                mini = value;
            } else {
                st.push(value);
            }
        }
    }
    
    public void pop() {
        if (st.isEmpty()) {
            return;
        }
        Long val = st.pop();
        if (val < mini) {
            // Decode the previous minimum value
            mini = 2 * mini - val;
        }
    }
    
    public int top() {
        Long val = st.peek();
        if (val < mini) {
            // If the top value is a special value, return the current minimum
            return mini.intValue();
        }
        return val.intValue();
    }
    
    public int getMin() {
        return mini.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */