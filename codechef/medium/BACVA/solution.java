import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ac=new Scanner(System.in);
		int t=ac.nextInt();
		while(t-->0){
		    int n=ac.nextInt();
		    ArrayList<Integer>al=new Arraylist<>();
		    int c=0;
		    while(n>0){
		        al.add(n%10);
		        no=no/10;
		        c+=no;
		    }
		    if(c%10==0){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}

	}
}
