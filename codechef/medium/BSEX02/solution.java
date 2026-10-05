import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int t=a.nextInt();
        while(t-->0){
            int n=a.nextInt();
            int c=0;
            for(int i=1;i<=n;i++){
                if(n-i>0){
                    n=n-i;
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
