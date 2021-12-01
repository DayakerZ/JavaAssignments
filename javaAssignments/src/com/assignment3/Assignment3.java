package com.assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The IP address :");
        String ipAddress=sc.nextLine();
        System.out.println("Enter The count : ");
        int count=sc.nextInt();
        long median=ping(ipAddress,count);
        System.out.println("Median is "+median);
    }
    public static long ping(String ipAddress,int count) throws Exception {
        Socket socket;
        try {
            socket=new Socket(ipAddress,80);
        }catch (UnknownHostException e){
            System.out.println(e);
            return -1;
        }

        long[] time=new long[count];
        while (count>0){
            long startTime = System.nanoTime();
            InetAddress address=null;
            address=socket.getInetAddress();
            if(address!=null){
                System.out.println("Connected to : "+address);
                long endTime = System.nanoTime();
                count--;
                time[count]=endTime-startTime;
            }else {
                System.out.println("Host connection failed ....");
                break;
            }
        }
        Arrays.sort(time);
        return time[time.length/2];
    }

}