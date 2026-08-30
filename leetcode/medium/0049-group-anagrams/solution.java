class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();

        }
        HashMap<String,List<String>>a=new HashMap<>();
        int[] arr=new int[26];
        for(String s: strs){
            Arrays.fill(arr,0);
            for(int j=0;j<s.length();j++){
                arr[s.charAt(j)-'a']++;

            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<arr.length;i++){
                sb.append("#");
                sb.append(arr[i]);
            }
            String k=sb.toString();
            if(!a.containsKey(k)){
                a.put(k, new ArrayList<>());

            }
            a.get(k).add(s);
        
        }
        return new ArrayList(a.values());
        
    }
}