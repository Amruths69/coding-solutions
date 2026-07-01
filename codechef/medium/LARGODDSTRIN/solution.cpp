 public static String findLargestOddSubstring(String num) {
     
     int g=-1;
     for(int i=num.length()-1;i>=0;i--){
         char c=num.charAt(i);
         if(c%2!=0){
             g=i;
             break;
         }
     }
     if(g==-1){
         return '-1';
     }
     return num.substring(0,g+1);
     
 }
     