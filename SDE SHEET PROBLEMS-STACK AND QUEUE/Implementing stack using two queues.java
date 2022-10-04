class MyStack {
   Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
        
    }
    
    public void push(int x) {
        while(q1.isEmpty()==false){
            q2.add(q1.remove());
        }
        q1.add(x);
        while(q2.isEmpty()==false){
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
       return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()==true){
            return true;
        }
        return false;
    }
}
