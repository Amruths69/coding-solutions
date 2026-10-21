class Solution {
    public static int filterUsingStreams(int[] arr) {
        // code here
        int[] o=Arrays.stream(arr).filter(n->n%2!=0).toArray();
        return Arrays.stream(o).max().getAsInt();
    }
}