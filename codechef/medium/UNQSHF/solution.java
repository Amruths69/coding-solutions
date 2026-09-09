import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int t=a.nextInt();
		while(t-->0){
		    int n=a.nextInt();
		    String aa=a.next();
		    String bb=a.next();
		    int ca=0;
		    int cb=0;
		    for(int i=0;i<n;i++){
		        char g=aa.charAt(i);
		        if(g=='a'){
		            ca++;
		        }
		    }
		    for(int i=0;i<n;i++){
		        char g=bb.charAt(i);
		        if(g=='b'){
		            cb++;
		        }
		    }
		    if(ca==cb){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}

	}
}
