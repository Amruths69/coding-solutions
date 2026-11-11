class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer>ts=new TreeSet<>();
        for(int i=0;i<a.length;i++){
            ts.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            ts.add(b[i]);
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i:ts){
            al.add(i);
        }
        return al;
    }
}
