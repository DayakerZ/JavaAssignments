package com.assignment1;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {

    public static void recursive(File dir){

    }

    public static boolean find(File file,String fileName){

        File[] listOfFilesNames = file.listFiles();//creates a array of File objects
        Pattern pattern = Pattern.compile(fileName);
        Matcher matcher;
        int count =0;
        for (File name : listOfFilesNames){
            matcher = pattern.matcher(name.getName());
            if(name.isDirectory()){
                if(find(name,fileName)){
                    count++;
                }
            }
            else {
                if(matcher.find() && matcher.group().equals(name.getName())) {
                    System.out.println("File found and its path is :" + name.getAbsolutePath());//prints absolute path
                    count++;
                }
            }
        }
        if(count>0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        File file = new File("/home/dayark");//File object creation
        File[] files = file.listFiles();
        try {
            do {
                System.out.println("Enter the regular expression");
                fileName = scanner.nextLine();
            }while (!find(file,fileName));
        }
        catch (InputMismatchException e){
            System.out.println("Invalid regular expression");
        }
    }//end of main
}

