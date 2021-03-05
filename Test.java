
package com.zoho.task;


public class Test {

    public static void main(String[] a){
        //System.out.println("--->" + Math.ceil((4+1)/2));
        String aa = "WELCOME"; int i,j;

        int length = aa.length();
        System.out.print(aa.length());
        int centerLetter = (length) /2;
        System.out.println("--?"+centerLetter);
        int needToPrintFrom = centerLetter;
        int needToPrintTo = centerLetter;
        for(i = 0; i < length; i++){
            for(j=2*(5 - i); j> 0; j--){
                System.out.print(" ");
            }
            if(needToPrintTo == length){
                needToPrintFrom = 0;
                needToPrintTo = 0;
            }
            
            

            int dummyTo =  needToPrintTo;
            for(int val = needToPrintFrom; val<= dummyTo ;val++) {
               // System.out.print(aa.substring(needToPrintFrom, needToPrintTo+1));
                System.out.print(aa.charAt(val));
                if(needToPrintFrom < centerLetter){
                    for(int val1 = centerLetter; val1 <= (length-1) ;val1++) {
                        System.out.print(aa.charAt(val1));
                    }
                }
               // needToPrintFrom++;
            }
            needToPrintTo++;
            System.out.println();
        }
    }
}
