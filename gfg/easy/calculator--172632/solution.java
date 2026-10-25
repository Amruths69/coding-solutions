class Solution {
    public void calculate(int a, int b, int optr) {
        // code here
        switch(optr){
            case 1:
            System.out.print(a+b);
            break;
            case 2:
            System.out.print(b-a);
            break;
            case 3:
            System.out.print(b*a);
            break;
            default:
            System.out.print("Invalid Input");
            
        }
    }
}