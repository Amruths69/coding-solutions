/* You are required to complete below methods */
class GfG {
    /*inserts an element x to the set s */
    void insert(LinkedHashSet<Integer> s, int x) {
        // Your code here
        s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_Contents_Increasing_Order(LinkedHashSet<Integer> s) {
        
        // Your code here
        TreeSet<Integer>ts=new TreeSet<>(s);
        for(int i:ts){
            System.out.print(i+" ");
        }
    }

    /*prints the contents of the set s in ascending order */
        
    void print_Contents_Insertion_Order(LinkedHashSet<Integer> s) {
        // Your code here
        for(int i:s){
            System.out.print(i+" ");
        }
        
    }

        
    /*erases an element x from the set s */
    void erase(LinkedHashSet<Integer> s, int x) {
        // Your code here
        s.remove(x);
    }
        

    /*returns the size of the set s */
    int size(LinkedHashSet<Integer> s) {
        // Your code here
        return s.size();
    }
        

    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(LinkedHashSet<Integer> s, int x) {
        // Your code here
        return s.contains(x)?1:-1;
    }
}