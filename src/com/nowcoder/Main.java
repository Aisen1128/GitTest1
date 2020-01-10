package com.nowcoder;

import sun.awt.windows.WPrinterJob;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;



public class Main {

    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d}, %s",
                index, obj.toString()));
    }

    public static void demoCommon(){
        Random random=new Random();
        for(int i=0;i<4;i++){
            print(i,random.nextInt(100));
        }
        List<Integer> array= Arrays.asList(new Integer[]{1,2,3,4,5});
        Collections.shuffle(array);
        print(5,array);
        Date date=new Date();
        print(6,date);
        print(7,date.getTime());
        DateFormat df=new SimpleDateFormat("HH:mm:ss yyyy/MM/dd");
        print(8,df.format(date));
        print(9,UUID.randomUUID());
        print(10,array);
    }
    public static void main(String[] args) {
	    demoCommon();
    }
}
