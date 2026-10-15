class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int p=Query.get(0);
       
        if(Q==1){
             int r=Query.get(1);
            for(int i=0;i<A.size();i++){
                if(i==p){
                    A.add(p,r);
                    
                    
                }
            }
            return A;
            
        }
        else{
            int h=Query.get(0);
            for(int i=A.size()-1;i>=0;i--){
                if(A.get(i)==h){
                    al.add(i);
                    return al;
                }
            }
        }
        
        ArrayList<Integer>ho=new ArrayList<>();
        ho.add(-1);
        return ho;
        
    }
}