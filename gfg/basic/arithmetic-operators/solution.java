import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int p=x+y;
        int q=x-y;
        int r=x*y;
        double s=(double)x/y;
        int t=x/y;
        int u=x%y;
        

        System.out.printf("%d %d %d %.3f %d %d", p, q, r, s, t, u);
    }
}