class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        int es=0;
        int os=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(i%2==0){
                es+=i;
                
            }else{
                os+=i;
            }
        }
        al.add(es);
        al.add(os);
        return al;
    }
}