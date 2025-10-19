class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    

/*
    "minStack" itsSelf is like a copy used to store all the minium values during the push process
    So even if some lager numbers are deleted from "stack",
    it doesn't affect the smallest values


*/


    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int removed = stack.pop();
        if(removed == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
       return minStack.peek(); 
    }
}
