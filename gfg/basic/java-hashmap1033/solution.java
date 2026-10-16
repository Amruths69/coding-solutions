class Solution {
    static int map(int n, String keys[], int arr[], String s) {
        // code here
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(keys[i],arr[i]);
            
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(s)){
                  return hm.get(s);
            }
        
    }
    return -1;
    
}}