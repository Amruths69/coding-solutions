class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int m=n/2;
        int[] p=nums;
        long t=0;
        for(int i:nums){
            t+=i;
        }
        long fh=0;
    for(int i=0;i<m;i++){
    fh+=nums[i];
    }
int a=0;
for(int j=0;j<n;j++){
    if(fh>t-fh){
        a++;
    }
    fh-=nums[j];
    fh+=nums[(j+m)%n];
}
return a;
        
    }
}