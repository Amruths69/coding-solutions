class Solution {

    int[] getDigitDiff1AndLessK(int[] arr, int k) {
        // code here
        int[] arr1=new int[arr.length];
        int jk=0;
        for(int i=0;i<arr.length;i++){
            int g=String.valueOf(arr[i]).length();
            if(g>=2 && arr[i]<k){
                int y=arr[i];
                boolean b=true;
                int c=0;
                while(y>9){
                    int f=y%10;
                    int j=(y/10)%10;
                    if(Math.abs(f-j)!=1){
                        c++;
                    }
                    y=y/10;
                }
                
                if(c==0){
                    arr1[jk]=arr[i];
                    jk++;
                }else{
                    continue;
                    
                }
            }
            
        }
        int[] r=new int[jk];
        for(int i=0;i<jk;i++){
            r[i]=arr1[i];
        }
        return r;
    }
}