class Solution {
    static HashMap<String,Integer>hm=new HashMap<>();
    static{
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);
        hm.put("IV",4);
        hm.put("IX",9);
        hm.put("XL",40);
        hm.put("XC",90);
        hm.put("CD",400);
        hm.put("CM",900);
    }
    public int romanToInt(String s) {
        int su=0;
        int i=0;
        while(i<s.length()){
            if(i<s.length()-1){
                String ts=s.substring(i,i+2);
                if(hm.containsKey(ts)){
                    su+=hm.get(ts);
                    i=i+2;
                    continue;
                }

            }
            String os=s.substring(i,i+1);
            su+=hm.get(os);
            i=i+1;

        }
        return su;  
    }
}