class Solution {
    static Map<String,Integer>m=new HashMap<>();
    static{
        m.put("I",1);
        m.put("V",5);
        m.put("X",10);
        m.put("L",50);
        m.put("C",100);
        m.put("D",500);
        m.put("M",1000);
        m.put("IV",4);
        m.put("IX",9);
        m.put("XL",40);
        m.put("XC",90);
        m.put("CD",400);
        m.put("CM",900);
    }
    public int romanToInt(String s) {
        int su=0;
        int i=0;
        while(i<s.length()){
            if( i+ 1 < s.length()){
                String ts=s.substring(i,i+2);
                if(m.containsKey(ts)){
                    su+=m.get(ts);
                    i=i+2;
                    continue;
                }
            }
            String st=s.substring(i,i+1);
            su+=m.get(st);
            i=i+1;
        }
        return su;
        
    }
}