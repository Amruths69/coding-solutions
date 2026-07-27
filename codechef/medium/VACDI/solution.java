import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		ArrayList<Integer> vac=new ArrayList<>();
		int[] pat=new int[n];
		ArrayList<Boolean> boo=new ArrayList<>();
		
		for(int i=0;i<n;i++){
		    vac.add(a.nextInt());
		    
		}
		for(int i=0;i<n;i++){
		    pat[i]=a.nextInt();
		    
		}
		Collections.sort(vac);
Arrays.sort(pat);
		for(int i=0;i<pat.length;i++){
		    for(int j=0;j<vac.size();j++){
		        if(pat[i]<vac.get(j)){
		            boo.add(true);
		            vac.remove(j);
		            break;
		        }
		    }
		    
		}
		for (int i = 0; i < pat.length; i++) {

    boolean found = false;

    for (int j = 0; j < vac.size(); j++) {
        if (pat[i] < vac.get(j)) {
            found = true;
            vac.remove(j);
            break;
        }
    }

    boo.add(found);
}
		int cf=0;
		for(int i=0;i<boo.size();i++){
		    if (!boo.get(i)) {
    cf++;
}
		}
		if(cf==0){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}
}
