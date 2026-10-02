class Solution {
    static String delAlternate(String s) {
        // code here
        String h=" ";
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                continue;
            }else{
                char c=s.charAt(i);
                h+=c;
            }
        }
        return h;
    }
}