//the approach here we are following is we are pushing the previous min and value to the stack
class MinStack {
 Stack<Integer> s;
    public MinStack() {
        s=new Stack<Integer>();
    }
    int min=Integer.MAX_VALUE;
    public void push(int val) {
      //first we are pushing the min if the value is less than min......and we are also pushing the value
        if(val<=min){
            s.push(min);
            min=val;
        }
        s.push(val);
    }
    
    public void pop() {
      //whwnever we are popping the element which is equal to min element ...then we need to update the min and pop the previous min element to get the peek element
      //as the elements which we are pushed other than min elements
        if(s.pop()==min){
            min=s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}
