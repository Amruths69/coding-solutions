class Solution {
    public void eraseAt(ArrayDeque<Integer> deq, int x) {
        // code here
       Iterator<Integer>it=deq.iterator();
       int i=0;
       while(it.hasNext()){
           it.next();
           if(i==x){
               it.remove();
               break;
           }
           i++;
       }
    }

    public void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        // code here
        Iterator<Integer>it=deq.iterator();
       int i=0;
       while(it.hasNext()){
           it.next();
           if(i>=start && i<end){
               it.remove();
               
           }
           i++;
       }
        
    }

        
    public void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}