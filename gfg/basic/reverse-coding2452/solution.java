import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)System.out.println(0);
        else{
            int h=0;
            for(int i=1;i<=n;i++){
                h+=i;
            }
            System.out.println(h);
        }

        // code here
        
    }
}