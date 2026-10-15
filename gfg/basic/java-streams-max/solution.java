class Solution {
    public static int maxUsingStreams(int[] arr) {
        // code here
        int g=Arrays.stream(arr).max().getAsInt();
        return g;
    }
}