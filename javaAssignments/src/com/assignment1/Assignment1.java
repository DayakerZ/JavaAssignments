package com.assignment1;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {

    public static void find(File file,String fileName){

        File[] listOfFilesNames = file.listFiles();//creates a array of File objects
        Pattern pattern = Pattern.compile(fileName);
        Matcher matcher;
        for (File name : listOfFilesNames){
            matcher = pattern.matcher(name.getName());
            if(matcher.find()) {
                System.out.println("File found and its path is :" + name.getAbsolutePath());//prints absolute path
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        File file = new File("/home/dayark");//File object creation
        int flag = 1;
        try {
            while (flag == 1) {
                System.out.println("Enter the regular expresion: ");
                fileName = scanner.next();
                find(file, fileName);//function call
                System.out.println("Enter 1 if you want to search for other files and 0 to exit");
                flag = scanner.nextInt();
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid regular expression");
        }
    }//end of main
}
