class Solution {
    static HashMap<String,Integer>v=new HashMap<>();
    static{
        v.put("I",1);
        v.put("V",5);
        v.put("X",10);
        v.put("L",50);
        v.put("C",100);
        v.put("D",500);
        v.put("M",1000);
        

    }
    public int romanToInt(String s) {
        int r=0;
        for(int i=0;i<s.length();i++){
            int c=v.get(String.valueOf(s.charAt(i)));
            if(i+1<s.length()){
                int n=v.get(String.valueOf(s.charAt(i+1)));
                if(c<n){
                    r-=c;
                }else if(c>n){
                    r+=c;
                }else{
                    r+=c;
                }
            }else{
                r+=c;
            }
            
            
        }
        return r;
    }
}