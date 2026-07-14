class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
            char c=0;
            c=s[r];
            s[r]=s[l];
            s[l]=c;
            l++;
            r--;



        }
        
    }
}