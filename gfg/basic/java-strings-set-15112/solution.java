class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String f=s1+s2;
        String b=" ";
        for(int i=f.length()-1;i>=0;i--){
            char c=f.charAt(i);
            b+=c;
            
        }
        return b;
    }
}