class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            lhs.add(arr[i]);
        }
        ArrayList<Integer>al=new ArrayList<>(lhs);
        return al;
    }
}