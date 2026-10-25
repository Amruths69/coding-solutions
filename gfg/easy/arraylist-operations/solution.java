
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public void add(ArrayList<Integer> a, int x) {
        a.add(x);
    }

    public int remove(ArrayList<Integer> a) {
        if (a.isEmpty()) {
            return -1;
        }
        return a.remove(a.size() - 1);
    }

    public int get(ArrayList<Integer> a, int index) {
        if (a.isEmpty()) {
            return -1;
        }
        return a.get(index);
    }

    public void reverse(ArrayList<Integer> a) {
        Collections.reverse(a);
    }

    public void sort(ArrayList<Integer> a) {
        Collections.sort(a);
    }

    public int size(ArrayList<Integer> a) {
        return a.size();
    }
}
