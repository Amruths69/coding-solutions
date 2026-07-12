class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start = toSeconds(startTime);
        int end = toSeconds(endTime);
        return end - start;
    }

    private int toSeconds(String time) {
        int ho = Integer.parseInt(time.substring(0, 2));
        int mi = Integer.parseInt(time.substring(3, 5));
        int se = Integer.parseInt(time.substring(6, 8));

        return ho * 3600 + mi * 60 + se;
    }
        
    
}