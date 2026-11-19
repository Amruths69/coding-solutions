import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		int f=1;
		do{
		    f*=x;
		    x--;
		    
		}while(x>0);
		System.out.println(f);

	}
}
