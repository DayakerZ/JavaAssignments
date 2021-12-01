package com.assignment6.vampirenumber;

import java.util.Scanner;

public class VampireNumber {
    public static int countDigits(int number){

        return (int) Math.floor(Math.log10(number)+1);
    }
    public static boolean checkIfVampireNumber(int number){
            int count = countDigits(number);
            if(count%2==0)//checking if the number has even number of digits
            {

                for (int i = (int) Math.pow(10,(count/2)-1); i < (int) Math.pow(10,count/2); i++) {

                    if(number%i == 0){
                       int j = number/i;
                       if(j >= (int) Math.pow(10,count/2-1) && j < (int) Math.pow(10,count/2)){

                           //checking for trailing zeros
                           if (i%10==0 && j%10==0) {
                               continue;
                           }

                           if (checkCount(number, count, i, j))
                               return true;
                       }
                    }
                }//end of for
            }
            else {
                return false;
            }
            return false;
    }

    private static boolean checkCount(int number, int count, int i, int j) {

        int combinedNumberOfTwoFactors = (int) (i *Math.pow(10, count /2)+ j);//combining the two numbers
        int matchedCounts=0;
        for (int k = number; k>0 ; k/=10) {

            int count1=0,count2=0;
            for (int l = number; l > 0 ; l/=10) { // checking if original and combined number have same digits
                if(k%10==l%10)
                    count1++;
            }
            for (int l = combinedNumberOfTwoFactors; l >0 ; l/=10) {
                if(k%10 == l%10)
                    count2++;
            }
            if (count1==count2){
                matchedCounts++;
            }
            else
                break;

        }//end of for
        if(matchedCounts== count)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 1;
        for (int i = 1; count!=100; i++) {
            if(checkIfVampireNumber(i)){
                System.out.println(i);
                count++;
            }
        }
    }
}
