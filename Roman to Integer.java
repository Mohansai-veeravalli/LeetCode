class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int len= s.length();
        int ans[]=new int[len];
        for(int i=0;i<=s.length()-1;i++){
           switch(s.charAt(i)){
                case 'I':
                  ans[i] = 1;
                  break;
                case 'V':
                  ans[i] = 5;
                  break;
                case 'X':
                  ans[i]= 10;
                  break;
                case 'L':
                  ans[i]= 50;
                  break;
                case 'C':
                  ans[i]= 100;
                  break;
                case 'D':
                  ans[i]= 500;
                  break;
                case 'M':
                  ans[i]= 1000;
                  break;
            }
            
        }
        for(int i= 0;i<s.length()-1;i++){
             if(ans[i+1]>ans[i]){
                sum -= ans[i];
            }
            else{
                sum+=ans[i];
            }
        }
       
        return sum +ans[len-1];
    }
}
