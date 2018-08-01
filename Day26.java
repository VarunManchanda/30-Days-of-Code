import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
    int day, month, year;
    int day1, month1, year1;
    int fine;
    day = scan.nextInt();
    month = scan.nextInt();
    year = scan.nextInt();
    
    day1 = scan.nextInt();
    month1 = scan.nextInt();
    year1 = scan.nextInt();
    if(year<year1){
    	fine = 0;
    }
    else if(month==month1 && year==year1){
    fine = 15 * (day-day1);
    }
    else if(month!=month1 && year==year1){
    fine = 500 * (month-month1);	
    }
    else{
    	fine = 10000;
    }
        if(fine<0){
            System.out.println(0);
        }
        else{
    System.out.println(fine);
        }
    }
}
