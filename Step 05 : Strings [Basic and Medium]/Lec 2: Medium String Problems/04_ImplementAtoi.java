// Question Link: https://leetcode.com/problems/string-to-integer-atoi/description/


class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        int sign = 1;
        int i = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');
            
            if (ans * sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (ans * sign >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return (int) ans * sign;
    }
}
















//MINE
class Solution {
    public int myAtoi(String s) {
    //    StringBuilder str= new StringBuilder();
    //     boolean staken = true, zflag = false, pflag=false;
    //     for(int i=0;i<s.length();i++){
    //        if(!staken && s.charAt(i)=='+' && str.length()==1){
    //              str.append('0');
    //              break;
    //        }
    //        if(s.charAt(i)=='+'){
    //           pflag = true;
    //        }
           
    //        if((Character.isAlphabetic(s.charAt(i)) && str.isEmpty()) || (s.charAt(i)=='.' && str.isEmpty())){
    //                      str.append('0');
    //                      break;
    //        } else if((str.length()==1 && str.charAt(0)=='-' && Character.isAlphabetic(s.charAt(i))) || (str.length()==1 && str.charAt(0)=='-' && (s.charAt(i)=='.'))){
    //             str.append('0');
    //             break;
    //        }
    //        if(zflag && s.charAt(i)==' '){
    //              break;
    //        }
    //        //breaking condition
    //        if((s.charAt(i)=='.' && str.length()>=2) || (str.length()>=2 && !Character.isDigit(s.charAt(i))) || (s.charAt(i)==' ' && str.length()>=2)){
    //              break;
    //        }else if(s.charAt(i)=='.' && str.length()>=1){
    //             break;
    //        }
    //        if((s.charAt(i)=='-') && (staken)){
    //          if(zflag){
    //              str.append('0');
    //              break;
    //          }
    //          if(pflag){
    //              str.append('0');
    //              break;
    //          }else{
    //             str.append(s.charAt(i)); 
    //          }
            
    //          staken = false;
             
    //        }else if(s.charAt(i)=='0' && str.length()<1){
    //             zflag = true;
    //             continue;
    //        }else if(s.charAt(i)=='0' && str.length()==1 && s.charAt(0)=='-'){
    //             continue;
    //        }
    //        else if(Character.isDigit(s.charAt(i))){
                
    //             str.append(s.charAt(i));
    //        }
 
    //     }
    //     System.out.println(str);
        
    //      String number = !staken? (str.substring(1)) :(str.substring(0));
    //      System.out.println(number);
    //      if(number.length()>=19){
    //          return (!staken? Integer.MIN_VALUE:Integer.MAX_VALUE);
    //      }
    //      long num = 0;
    //      int idx = number.length()-1;
    //      long placeval = 1;
    //      while(idx>=0){
    //          num = num + (placeval*((number.charAt(idx))-'0'));
    //          placeval *= 10;
    //          idx--;
    //      }
         
        
 
 
 
 
    //      long prev = !staken? (-1)*num: num;
    //     if(prev>Integer.MAX_VALUE){
    //        prev = Integer.MAX_VALUE;
    //     }else if(prev<Integer.MIN_VALUE){
    //          prev = Integer.MIN_VALUE;
    //     }
       


    //    return (int)(prev);




   //SOLUTION by CHATgpt
    // Step 1: Remove leading whitespaces
        s = s.trim();
        if (s.isEmpty()) return 0;

        // Step 2: Check for sign
        int sign = 1, index = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Convert digits to number
        long result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');

            // Step 4: Handle overflow
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            index++;
        }

        return (int) (result * sign);





    }
}
