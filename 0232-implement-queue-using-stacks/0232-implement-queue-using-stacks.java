class MyQueue {
    Stack<Integer> s;
    Stack<Integer> stack;

    public MyQueue() {
        s = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
    }

    public int pop() {
        while (!s.isEmpty()) {
            stack.push(s.pop());
        }
        int ans = stack.pop();
        while (!stack.isEmpty()) {
            s.push(stack.pop());
        }
        return ans;
    }

    public int peek() {
        while (!s.isEmpty()) {
            stack.push(s.pop());
        }
        int ans = stack.peek();
        while (!stack.isEmpty()) {
            s.push(stack.pop());
        }
        return ans;
    }

    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */