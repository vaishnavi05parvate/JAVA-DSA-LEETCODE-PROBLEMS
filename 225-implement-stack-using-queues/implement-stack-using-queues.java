class MyStack {
Queue<Integer> queue=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
       queue.add(x) ;
    }
    
    public int pop() {
        for(int i=1;i<=queue.size()-1;i++){
        queue.add(queue.remove());
      }  
      int val=queue.remove();
      
      return val;
    }
    
    public int top() {
      for(int i=1;i<=queue.size()-1;i++){
        queue.add(queue.remove());
      }  
      int val=queue.peek();
      queue.add(queue.remove());
      
      return val;
    }
    
    public boolean empty() {
        if(queue.size()==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */