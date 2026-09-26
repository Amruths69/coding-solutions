class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int s=i+1;
            if(arr[i]==s){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
