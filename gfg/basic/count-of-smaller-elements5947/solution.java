
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int t=0;
        for(int i:arr){
            if(i<=x){
                t++;
            }
        }
        return t;
    }
}