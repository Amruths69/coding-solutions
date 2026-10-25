// Takes ArrayList as an argument and
// inserts the elements of the ArrayList into a
// TreeSet and returns the TreeSet.
class Solution {
   
    public static TreeSet<Integer> insert(int arr[]) {
        // Your code here
         TreeSet<Integer>s=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        return s;
        
    }

    // Takes a TreeSet as an argument and prints
    // the elements of the TreeSet. The newline
    // is provided by the driver code.
    public static void display(TreeSet<Integer> s) {
        for(int g:s){
            System.out.print(g+" ");
        }

        
        // Your code here
    }

    // Takes TreeSet and x as arguments and erases x
    // from the TreeSet. If erased, print "erased x"
    // else then print "not found".The newline
    // is provided by the driver code.

        
    public static void erase(TreeSet<Integer> s, int x) {
        if (s.remove(x)) {
            System.out.print("erased " + x);
        } else {
            System.out.print("not found");
        }
    }
}