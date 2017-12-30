import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



/*
This is modified Fibonacci sequence using recursion method and BigInteger Java class.
More information is from https://www.hackerrank.com/challenges/fibonacci-modified/problem
*/

public class Solution {
    
    public static int i = 2;
    public static BigInteger new_t1 = new BigInteger("0");
    public static BigInteger new_t2 = new BigInteger("0");

    static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
        // Complete this function
        
        if(n == 1){
            return t1;
        } else if(n == 2){
            return t2;
        } else {
            if(i++ < n) {
                new_t1 = t2;
                new_t2 = t2.multiply(t2);
                new_t2 = new_t2.add(t1);
                return(fibonacciModified(new_t1, new_t2, n));
           
            } else {
                return (new_t2);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t1 = new BigInteger(in.nextInt()+"");
        BigInteger t2 = new BigInteger(in.nextInt()+"");
        int n = in.nextInt();
        BigInteger result = fibonacciModified(t1, t2, n);
        System.out.println(result);
        in.close();
    }
}