class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            char f=s.charAt(i);
            if(f=='u'||f=='o'||f=='i'||f=='e'||f=='a'){
                c++;
            }
        }
        int m=c;
        for(int i=k;i<s.length();i++){

            if(isVowel(s.charAt(i-k)))
            c--;
            if(isVowel(s.charAt(i)))
            c++;
            m=Math.max(m,c);
        }
        return m;
        
    }
    public boolean isVowel(char f){
        return f=='u'||f=='o'||f=='i'||f=='e'||f=='a';
    }
}