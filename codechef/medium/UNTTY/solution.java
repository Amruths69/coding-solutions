import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ac=new Scanner(System.in);
		String s=ac.nextLine();
		Stack<Character>st=new Stack<>();
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)!='#'){
		        st.push(s.charAt(i));
		    }else if(s.charAt(i)=='#'){
		        if(!st.isEmpty()){
		        st.pop();
		    }}
		}
		StringBuilder sb=new StringBuilder();
		for(char i:st){
		    sb.append(i);
		}
		String s1=sb.toString();
		System.out.println(s1);
		

	}
}
