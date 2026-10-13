class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int m=b[0];
        int s=0;
        for(int i=0;i<b.length;i++){
            if(m<=b[i]){
                m=b[i];
                
            }
            
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j){
                    s+=a[i][j];
                }
                
            }
            
        }
        ArrayList<Integer> al=new ArrayList<>();
        al.add(s);
        al.add(m);
        return al;
        
    }
}
