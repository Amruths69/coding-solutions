class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm=new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hm.containsKey(c)){
                st.push(c);
            }else{
                if(st.empty())
                return false;
                char te=st.pop();
            if(te!=hm.get(c)){
                return false;
            }
            }
            
        }
        
        return st.isEmpty();
        
    }
}