import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int max = 0;
        int case1 = 0;
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            case1 = k;
            if(n<2 || k<2){
                System.exit(0);
            }
            else{
                
                for(int i = 1; i < n; i++){
                    int j = i+1;
                    while(j<=n){
                    int and = i & j;
                    //System.out.println("And is "+and);    
                    if(max < and && and < case1){
                        max = and;
                        //System.out.println("Max is "+max);
                    }
                    
                    j++;    
                    }
                }
            }
            System.out.println(max);
            max = 0;
        }

        scanner.close();
    }
}

