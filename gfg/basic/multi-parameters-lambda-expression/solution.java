/*
The interface looks like

interface Add {
    public int addParameters(int a, int b);
}
*/

class Solution {
    public static Add helperFunction() {
        // Your code here
        return(a,b)->a+b;

        // Implement the addParameters method that returns a+b.
    }
}