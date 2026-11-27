class Solution {
    public void printTillN(int n) {
        // code here
        print(1,n);
    }
    public void print(int i, int n){
        if(i>n) return;
        System.out.print(i+" ");
        print(i+1,n);
    }
}