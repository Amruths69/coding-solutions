import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            int groupCount = 0;
            boolean inGroup = false;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (!inGroup) {
                        groupCount++;
                        inGroup = true;
                    }
                } else {
                    inGroup = false;
                }
            }
            
            System.out.println(groupCount);
        }
        
       
    }
}

	}
}
