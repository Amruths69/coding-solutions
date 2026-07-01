import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        Scanner a = new Scanner(System.in);

        int t = a.nextInt();
        a.nextLine();

        while(t-- > 0){

            String s = a.nextLine();

            String[] arr = s.split(" ");

            StringBuilder ans = new StringBuilder();

            for(int i = 0; i < arr.length; i++){

                String w = arr[i];

                if(w.equals(w.toUpperCase())){
                    ans.append(w);
                }
                else{
                    w = w.toLowerCase();

                    char first = Character.toUpperCase(w.charAt(0));

                    ans.append(first);

                    if(w.length() > 1){
                        ans.append(w.substring(1));
                    }
                }

                if(i != arr.length - 1){
                    ans.append(" ");
                }
            }

            System.out.println(ans);
        }
    }
}