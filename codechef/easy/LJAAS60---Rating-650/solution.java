import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner ac=new Scanner(System.in);
		int a=ac.nextInt();
		if(a>90)System.out.println("A");
		else if(a<90 && a>70)System.out.println("B");
		else if(a<70 && a>=40)System.out.println("C");
		else System.out.println("F");
		int b=ac.nextInt();
		if(b>90)System.out.println("A");
		else if(b<90 && b>70)System.out.println("B");
		else if(b<70 && b>=40)System.out.println("C");
		else System.out.println("F");
		int c=ac.nextInt();
		if(c>90)System.out.println("A");
		else if(c<90 && c>70)System.out.println("B");
		else if(c<70 && c>=40)System.out.println("C");
		else System.out.println("F");
        

	}
}
