class Solution {
    int findSum(int[] arr) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int s=0;
        
        for(int i:hs){
            s+=i;
        }
        return s;
    }
}