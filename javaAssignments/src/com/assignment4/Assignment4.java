package com.assignment4;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine();
        String[] inputDates = new String[numberOfTestCases];
        for (int i = 0; i < numberOfTestCases; i++) {

            inputDates[i] = scanner.nextLine();
        }
        getRanges(inputDates);
    }

    private static void getRanges(String[] inputDates) {

        for(String date : inputDates){
            String[] dates = date.split(" ");
            String[] date1 = dates[0].split("-");
            String[] date2 = dates[1].split("-");
            LocalDate signupDate = LocalDate.of(Integer.parseInt(date1[2]),Integer.parseInt(date1[1]),Integer.parseInt(date1[0]));
            LocalDate currentDate = LocalDate.of(Integer.parseInt(date2[2]),Integer.parseInt(date2[1]),Integer.parseInt(date2[0]));
            Period period = Period.between(signupDate,currentDate);
            if(signupDate.compareTo(currentDate)<=0) {

                LocalDate anniversary = LocalDate.of(Integer.parseInt(date2[2]),Integer.parseInt(date1[1]),Integer.parseInt(date1[0]));
                LocalDate rangeDateOne = anniversary.minusDays(30);
                if(anniversary.plusDays(30).compareTo(currentDate)<0 ){
                    LocalDate rangeDateTwo = anniversary.plusDays(30);
                    System.out.print(rangeDateOne.getDayOfMonth()+"-"+ rangeDateOne.getMonthValue()+"-"+rangeDateOne.getYear());
                    System.out.println(" "+rangeDateTwo.getDayOfMonth()+"-"+rangeDateTwo.getMonthValue()+"-"+rangeDateTwo.getYear());
                }
                else {
                    System.out.print(rangeDateOne.getDayOfMonth()+"-"+ rangeDateOne.getMonthValue()+"-"+rangeDateOne.getYear());
                    System.out.println(" "+currentDate.getDayOfMonth()+"-"+currentDate.getMonthValue()+"-"+currentDate.getYear());
                }
            }
            else{
                System.out.println("No range");
            }
        }
    }
}
    /*
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016

     */