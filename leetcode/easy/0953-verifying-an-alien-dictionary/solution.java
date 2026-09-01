class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<order.length();i++){
            m.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++){
            for(int j=0;j<words[i].length();j++){
                if(j>=words[i+1].length())
                return false;
                if(words[i].charAt(j)!=words[i+1].charAt(j)){
                    int c=m.get(words[i].charAt(j));
                    int n=m.get(words[i+1].charAt(j));
                    if(c>n){
                        return false;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return true;
        
    }
}