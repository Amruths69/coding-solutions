class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int l=0;
        int r=list.size()-1;
        while(l<=r){
            int m=(r-l)/2+l;
            if(list.get(m)==k){
                return m;
            }else if(list.get(m)>k){
                r=m-1;
            }else{
                l=m+1;
            }
            
        }
        return -1;

        // If k in arr return 1, else return -1
    }
}