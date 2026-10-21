import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> uniqueSorted(int arr[]) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        Collections.sort(al);
       for(int i = al.size() - 1; i > 0; i--) {
                   if(al.get(i).equals(al.get(i - 1))) {
                       al.remove(i);
                   }
               }

               return al;
    }
}