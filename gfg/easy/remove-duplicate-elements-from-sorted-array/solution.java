class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        LinkedHashSet<Integer>hs=new LinkedHashSet<>();
         for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i:hs){
            al.add(i);
        }
        return al;
    }
}
