class Solution {
    public static boolean areEqual(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        // Your code here
        int l1=0;
        int l2=0;
        if(ll1.size()!=ll2.size()){
            return false;
        }
        for(int i=0;i<ll1.size();i++){
            if(ll1.get(i)==ll2.get(i)){
                l1++;
            l2++;
                continue;
            }else{
                return false;
            }
            
        }
        return true;
    }
}
