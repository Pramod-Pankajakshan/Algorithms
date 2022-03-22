package stack;

import java.util.Stack;

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int newval) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(newval <= min){          
            stack.push(min);
            min=newval;
        }
        stack.push(newval);
    }
    
    
    //200
    //50
    //100
    // max
    
    //pop
    //200 gone !=min which is 50
    // pop ==50 so now min=100;

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min)
        	min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}