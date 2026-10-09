import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        
            if(n%3==0 && n%5==0){
                System.out.print("FizzBuzz");
            }else if(n%5==0){
                System.out.print("Buzz");
            }else if(n%3==0){
                System.out.print("Fizz");
            }else{
                System.out.print(n);
            }
                
            }
        
    }
