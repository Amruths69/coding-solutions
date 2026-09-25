class myStack {
    int[] arr;
    int t;

    public myStack(int n) {
        arr=new int[n];
        t=-1;
            
    }
    

    public boolean isEmpty() {
        
        return t==-1;
        
        
    }

    public boolean isFull() {
        return t==arr.length-1;
    }

    public void push(int x) {
        t++;
        arr[t]=x;
        
    }

    public void pop() {
        
        if(t!=-1){
        t--;}
    }

    public int peek() {
        if(t==-1){
            return -1;
        }
        return arr[t];
    }
}