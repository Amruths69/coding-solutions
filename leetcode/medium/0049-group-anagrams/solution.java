class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        int[] a=new int[26];
        HashMap<String,List>hm=new HashMap<>();
        for(String h:strs){
            Arrays.fill(a,0);
            for(char c:h.toCharArray()){
                a[c-'a']++;

            }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append("#");
            sb.append(a[i]);
        }
        String k=sb.toString();
        if(!hm.containsKey(k)){
            hm.put(k,new ArrayList());
        }
        hm.get(k).add(h);
        }
        return new ArrayList(hm.values());
    }
}