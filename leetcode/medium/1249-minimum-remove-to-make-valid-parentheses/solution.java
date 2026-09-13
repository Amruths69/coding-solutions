class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> hm=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else if(s.charAt(i)==')'){
                if(st.isEmpty()){
                    hm.add(i);
                }else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
        hm.add(st.pop());
        }
        StringBuilder r=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!hm.contains(i)){
                r.append(s.charAt(i));
            }
        }
        return r.toString();
        
    }
}