package com.assignment2;

import java.util.Scanner;

public class Assignment2 {

    public static boolean check(String string){

        for(int i =0;i<26;i++){
            if(!string.contains((char)('a'+i)+"")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();
        if(check(inputString))
            System.out.println("The String contains all the letters of the alphabets ");
        else
            System.out.println("The String does not contain all the letters of the alphabets ");

        /*
        import java.util.Scanner;
        import java.util.Set;
        import java.util.HashSet;
        public class Assignment2 {
            public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
                String inputString = scanner.nextLine().toLowerCase();
                Set<Character> st = new HashSet<>();

                for(char ch : inputString.toCharArray()){
                    if(ch >= 'a' && ch<='z')
                        st.add(ch);
                }
                System.out.println(st.size() == 26);
           }
        }
         */

    }
}
//Time complexity is O(n) where n is string length
//Space complexity is O(1)
