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
		    int b=a.nextInt();
		    int c=a.nextInt();
		    if(b>c){
		        System.out.println("Car");
		        
		    }else if(c>b){
		        System.out.println("Bike");
    	    }else{
    	        System.out.println("Same");
    	    }
		}

	}
}
