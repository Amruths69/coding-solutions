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
        for(int i=1;i<n;i++){
            if(arr.get(i-1)==arr.get(i)||arr.get(i+1)==arr.get(i)){
                arr.remove(arr.get(i));
                
            }
        }
        System.out.println(arr.size());
        
    }
}