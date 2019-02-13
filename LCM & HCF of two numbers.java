import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
        // int res = 1;
        // for (int i = 2; i <= Math.min(x, y); i++) {
        //     if ((x % i == 0) && (y % i == 0)) {
        //         res = i;
        //     }
        // }
        // return res;
    }
    public static int lcm(int x, int y) {
        int hcf = gcd(x, y);
        return (x * y) / hcf; 
        // int max = Math.max(x, y);
        // while (true) {
        //     if (max % x == 0 && max % y == 0) {
        //         return max;
        //     }
        //     max++;
        // }
    }
    public static void main (String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-- != 0) {
             int x = sc.nextInt();
             int y = sc.nextInt();
             System.out.println(lcm(x, y) + " " + gcd(x, y));
         }
     }
}