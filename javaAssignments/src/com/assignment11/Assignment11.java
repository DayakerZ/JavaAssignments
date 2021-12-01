package com.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment11 {

    public static void main(String[] args) {

        File file = new File(args[0]);// /home/dayark/Desktop/JavaAssignments/javaAssignments/src/com/assignment11/input.txt
        try{
            Scanner scanner = new Scanner(file);
            Map<Character,Integer> map = new HashMap<Character,Integer>();
            while(scanner.hasNext())
            {
                for (char character : scanner.nextLine().toCharArray())
                {
                    if(map.containsKey(character))
                    {
                        int value = map.get(character);
                        map.replace(character,value,value+1);
                    }
                    else
                        map.put(character,1);
                }
            }
            PrintWriter writer = new PrintWriter("/home/dayark/Desktop/JavaAssignments/javaAssignments/src/com/assignment11/output.txt");
            for (Character character:map.keySet()){
                writer.println(character+":"+map.get(character));
            }
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

    }
}
