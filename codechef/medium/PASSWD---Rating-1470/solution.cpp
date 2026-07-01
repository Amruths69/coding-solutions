import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int t=a.nextInt();
		a.nextLine();
		while(t-->0){
		    int l=0;
		    int u=0;
		    int n=0;
		    int s=0;
		    
		    
		    String p=a.nextLine();
		    for(int i=0;i<p.length();i++){
		        char c=p.charAt(i);
		        if(c>='a' && c<='z'){
		            l++;
		        }else if(c>='A'&&c<='Z'&&i!=0&&i!=p.length()-1){
		            u++;
		        }else if(c>='0'&&c<='9'&&i!=0&&i!=p.length()-1){
		            n++;
		        }else if((c=='@'||c=='#'||c=='%'||c=='&'||c=='?'&&i!=0&&i!=p.length()-1){
		            s++;
		        }
		        
		    }
		    if(l>0&&u>0&&n>0&&s>0&&p.length()>=10){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		}
	}
}
