import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> reserved = new HashMap<>();
        
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            reserved.put(row, reserved.getOrDefault(row, 0) | (1 << col));
        }
        
        int maxGroups = (n - reserved.size()) * 2;
        
        for (int mask : reserved.values()) {
            boolean leftFree = (mask & 60) == 0;
            boolean rightFree = (mask & 960) == 0;
            boolean middleFree = (mask & 240) == 0;
            
            if (leftFree && rightFree) {
                maxGroups += 2;
            } else if (leftFree || rightFree || middleFree) {
                maxGroups += 1;
            }
        }
        
        return maxGroups;
    }
}