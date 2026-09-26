class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        int p=date%2;
        long amt=0;
        if(p==0){
        for(int i=0;i<car.length;i++){
                if(car[i]%2==1){
                    amt+=fine[i];
                    
                }
                
            }}
            else{
                for(int i=0;i<car.length;i++){
                if(car[i]%2==0){
                    amt+=fine[i];
                    
                }
                
            }
            }
        
            
        
        return amt;
    }
}