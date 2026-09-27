class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        ArrayList<Integer>alo=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                al.add(arr[i]);
            }else{
                alo.add(arr[i]);
            }
        }
        Collections.sort(al);
        Collections.sort(alo);
        int e1=al.size();
        int b=0;
        int t=0;
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(b<al.size()){
                arr[i]=al.get(b);
                b++;
                
            }else{
                arr[i]=alo.get(t);
                t++;
            }
        }
       
        
    }
}