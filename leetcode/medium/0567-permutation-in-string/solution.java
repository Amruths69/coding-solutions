class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        for(int i=0;i<=m-n;i++){
            String sub=s2.substring(i,i+n);
            if(p(s1,sub)){
                return true;
            }
        }
        return false;
        
    }
    boolean p(String a,String b){
        int[] f=new int[26];
        for(int i=0;i<b.length();i++){
            f[a.charAt(i)-'a']++;
            f[b.charAt(i)-'a']--;
        }
        for(int i:f){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}