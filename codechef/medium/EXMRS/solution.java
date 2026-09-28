import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int c=a.nextInt();
		int m=a.nextInt();
		int w=a.nextInt();
		int p=a.nextInt();
		int r=a.nextInt();
        if((c*m)-(w-p)>=r){
            System.out.println("Yes");
        }else if((c*m)-(w*p)<r){
            System.out.println("No");
        }
	}
}
