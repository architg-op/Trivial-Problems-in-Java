import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while (t-- != 0) {
	         int m = sc.nextInt();
	         int n = sc.nextInt();
	         System.out.println(countPaths(m, n));
	     }
	 }
	 
	 static int countPaths(int m, int n) {
	     if (m == 0 || n == 0) {
	         return 1;
	     }
	     return (countPaths(n - 1, m) + countPaths(n, m - 1));
	 }
}