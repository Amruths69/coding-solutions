import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // code here
        if(ch=='a'|| ch=='A' || ch=='e'||ch=='E'|| ch=='I'|| ch=='i' || ch=='O'|| ch=='o'||ch=='U'||ch=='u'){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}