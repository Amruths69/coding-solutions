
class Solution {
    public void arrayTraversal(int[] arr) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        for(int i:al){
            System.out.print(i+" ");
        }
    }
}
