class Solution {
    public int largestRectangleArea(int[] heights) {
        int mA=0;
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int cH=(i==n)?0:heights[i];
            while(!st.isEmpty() && cH < heights[st.peek()]){
                int h1=heights[st.pop()];
                int w=st.isEmpty()? i: i-st.peek()-1;
                mA=Math.max(mA,h1*w);
            }
            st.push(i);
        }
        return mA;
        
    }
}