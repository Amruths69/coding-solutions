class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer>ad=new ArrayDeque<>();
        for(int i=0;i<arr.size();i++){
            ad.addLast(arr.get(i));
        
    }
    return ad;
}}