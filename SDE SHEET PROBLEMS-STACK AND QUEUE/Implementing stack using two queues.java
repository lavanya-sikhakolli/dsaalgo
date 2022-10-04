class MyStack {
   Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
        
    }
    //By considering push() as costly....therefore whenever we call pop() then we will get element which is added lately...which exhibits the stack operation.
   //if we want to add 20 to the queue....q1={10,5,15},q2={}......we will add all the elements from q1 to q2 and add the new element in q1....q1={20},q2={10,5,15}
   //Now add all the elements into q1 from q2.
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
