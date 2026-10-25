import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        if(n%2!=0){
            System.out.println("You");
        }else{
            System.out.println("Friend");
        }

        sc.close();
    }
}