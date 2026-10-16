class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // code here
        int g=arr.get(0);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>g){
                g=arr.get(i);
            }
        }
        return g;
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        // code here.
        int g=arr.get(0);
        for(int i=0;i<arr.size();i++){
            if(g>arr.get(i)){
                g=arr.get(i);
            }
        }
        return g;
    }
}
