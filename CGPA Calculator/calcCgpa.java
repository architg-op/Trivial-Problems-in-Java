/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author architgarg
 */
import java.util.Scanner;

public class calcCgpa {
    
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        int currentSem;
        System.out.println("Enter Current Semester");
        currentSem = sc.nextInt();
        int i = currentSem - 1;
        double sgpa[] = new double[i];
        int j = 1;
        while (i > 0) {
           System.out.println("Enter " + j + " Sem SGPA");
           sgpa[j - 1] = sc.nextDouble();
           j++;
           i--;
        } 
        double sum = 0;
        for (int k = 0; k < sgpa.length; k++) {
            sum += sgpa[k];
        }
        double res = sum / sgpa.length;
       
        System.out.println("CGPA = " + Math.round(res * 100d) / 100d);
    }
}
