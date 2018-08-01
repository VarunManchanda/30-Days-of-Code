import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
int max;
static int last;
int arr_size;
public Difference(int[] e){
    arr_size = e.length;
    elements = new int[e.length];
    for(int i=0; i<e.length; i++){
        elements[i] = e[i];
    }
}
public void computeDifference(){
    int indexer = arr_size - 1;
    int indexer1 = indexer;
    int max = 0;
    int absDiff = 0;
    for(int i = 0; i<=indexer; i++){
        int j = i;
        int k = indexer1;
        while(j<k){
            absDiff = Math.abs(elements[j] - elements[k]);
            if(max < absDiff){
                max = absDiff;
                k--;
            }
            else{
                k--;
            }
        }
        indexer--;
    }
    maximumDifference = max;
   // System.out.println(maximumDifference);
}
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
