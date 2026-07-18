class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        StringBuilder c=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==x){
                a.append(ch);
            }else if(ch==y){
                c.append(ch);
            }else{
                b.append(ch);
            }
           
        }
         return(c.toString()+b.toString()+a.toString());
        
    }
}