class MySet {

    // Insert an element into the set.
    public void insert(HashSet<Integer> s, int x) {
        // code here
        s.add(x);
    }

    // Remove an element from the set if it exists.
    public void erase(HashSet<Integer> s, int x) {
        
        // code here
        s.remove(x);
    }

    // Return the number of distinct elements in the set.
        
    public int size(HashSet<Integer> s) {
        // code here
        return s.size();
    }

        
    // Return 1 if the element exists; otherwise, return -1.
    public int find(HashSet<Integer> s, int x) {
        // code here
        if(s.contains(x)){
            return 1;
        }else{
            return -1;
        }
    }
}
