import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(a.nextInt());
            
        }
        for (int i = 0; i < arr.size(); i++) {

            boolean left = (i > 0 && arr.get(i).equals(arr.get(i - 1)));
            boolean right = (i < arr.size() - 1 && arr.get(i).equals(arr.get(i + 1)));

            if (left || right) {
                arr.remove(i);   
                i--;             
            }
        }
        System.out.println(arr.size());
        
    }
}