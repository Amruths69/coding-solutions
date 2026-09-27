class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        ArrayList<Integer>al=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(i%2==1){
                al.add(arr[l]);
                l++;
            }else {
                al.add(arr[r]);
                r--;
            }
            i++;
        }
        return al;
        
        
    }
}
