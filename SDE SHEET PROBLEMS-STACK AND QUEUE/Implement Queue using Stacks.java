class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }
    //By making push costly 
    public void push(int x) {
        while(s1.isEmpty()==false){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(s2.isEmpty()==false){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
       return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.isEmpty()==true){
            return true;
        }
        return false;
    }
}
