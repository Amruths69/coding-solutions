import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            String ne="";

            for(int i=0;i<n;i+=2){
                char f=s.charAt(i);
                char se=s.charAt(i+1);
                if(f=='0'&&se=='0'){
                    ne+="A";
                    
                }else if(f=='0'&&se=='1'){
                    ne+="T";
                }else if(f=='1'&&se=='0'){
                    ne+="C";
                }else if(f=='1'&&se=='1'){
                    ne+="G";
                }
            
            
            
            }
            System.out.println(ne);
        }
    }
}
