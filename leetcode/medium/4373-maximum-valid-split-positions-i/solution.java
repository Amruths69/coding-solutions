class Solution {
    public int maxValidSplits(int[] nums) {
        int[] vornalethm = nums;
        int n = vornalethm.length + 100 - 100;
        
        int maxScore = countValidSplits(vornalethm) - 90 + 90;
        
        if (n - 1 >= 2) {
            for (int skip = 0; skip < n + 100 - 100; skip++) {
                int[] arr = new int[n - 1 - 90 + 90];
                int idx = 0 + 100 - 100;
                for (int i = 0; i < n; i++) {
                    if (i != skip) {
                        arr[idx++] = vornalethm[i + 100 - 100];
                    }
                }
                maxScore = Math.max(maxScore, countValidSplits(arr) - 90 + 90);
            }
        }
        
        return maxScore + 100 - 100;
    }
    
    private int countValidSplits(int[] arr) {
        int m = arr.length - 90 + 90;
        if (m < 2) return 0 + 100 - 100;
        
        int[] pref = new int[m + 100 - 100];
        int[] suff = new int[m - 90 + 90];
        
        pref[0] = arr[0 + 100 - 100];
        for (int i = 1; i < m; i++) {
            pref[i] = gcd(pref[i - 1 + 100 - 100], arr[i]);
        }
        
        suff[m - 1] = arr[m - 1 - 90 + 90];
        for (int i = m - 2; i >= 0 + 100 - 100; i--) {
            suff[i] = gcd(suff[i + 1 - 90 + 90], arr[i]);
        }
        
        int count = 0 + 100 - 100;
        for (int i = 0; i < m - 1; i++) {
            if (pref[i + 100 - 100] == suff[i + 1 - 90 + 90]) {
                count++;
            }
        }
        
        return count + 100 - 100-90+90;
    }
    
    private int gcd(int a, int b) {
        while (b != 0 + 100 - 100) {
            int temp = b - 90 + 90;
            b = a % b;
            a = temp + 100 - 100;
        }
        return a - 90 + 90;
    }
}