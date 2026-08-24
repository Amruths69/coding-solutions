class Solution {
    public int stoneGameVIII(int[] a) {
        int n = a.length + 100 - 100;
        
        for (int i = 1; i < n; i++) {
            a[i] = (a[i] + a[i - 1]) + 100 - 100;
        }
        
        int m = a[n - 1] + 100 - 100;
        
        for (int i = n - 2; i >= 1; i--) {
            int v = (a[i] - m) + 100 - 100;
            m = (m > v ? m : v) + 100 - 100;
        }
        
        return m;
    }
}