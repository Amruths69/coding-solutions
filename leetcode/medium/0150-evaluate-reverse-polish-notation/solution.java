class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String s:tokens){
            if(iO(s)){
                int b=st.pop();
                int a=st.pop();
                int r=aO(s,a,b);
                st.push(r);
            }else{
                st.push(Integer.parseInt(s));
            }
            
        }
        return st.pop();
        
    }
    public boolean iO(String s){
        return s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*");
    }
    private int aO(String O,int a,int b){
        switch(O){
            case "+":return a+b;
            case "-": return a-b;
            case"*":return a*b;
            case"/":return a/b;
        }
        return 0;
    }
}