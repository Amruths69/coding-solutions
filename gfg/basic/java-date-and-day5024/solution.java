import java.util.*;
import java.text.*;

class Solution {
    static String findDay(int Day, int Month, int Year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Year, Month - 1, Day);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", Locale.ENGLISH);

        return sdf.format(cal.getTime()).toUpperCase(Locale.ENGLISH);
    }
}