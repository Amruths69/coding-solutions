class Solution {
    public int addDigits(int num) {
        int s=0;
        String g=Integer.toString(num);
        while(num>0){
            int d=num%10;
            s+=d;
            num/=10;
            if(g.length()!=1){
                continue;

            }

        }
        return s;
        
        
    }
}