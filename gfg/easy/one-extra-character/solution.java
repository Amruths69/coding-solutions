class Solution {
    public char extraChar(String s1, String s2) {
        // code here
        HashMap<Character,Integer>hm1=new HashMap<>();
        for(char c:s1.toCharArray()){
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer>hm2=new HashMap<>();
        for(char c:s2.toCharArray()){
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>e:hm2.entrySet()){
            if(!e.getValue().equals(hm1.getOrDefault(e.getKey(),0))){
                return e.getKey();
            }
        }
        for(Map.Entry<Character,Integer>e:hm1.entrySet()){
            if(!e.getValue().equals(hm2.getOrDefault(e.getKey(),0))){
                return e.getKey();
            }
        }
        return ' ';
        
        
    }
}