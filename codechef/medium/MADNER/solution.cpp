class Solution {
    public int findMaximumPairs(String s) {
        Scanner a=new Scanner(System.in);
        String b=a.next();
        int c=0;
        for(int i=0;i<b.length()-1;i++){
            char r=b.charAt(i);
            char g=b.charAt(i+1)
            if(r=='x'||r=='y'&&g=='x'||g=='y'){
                c++;
            }else{
                continue;
            }
        }
        System.out.println(c);
    }
}
