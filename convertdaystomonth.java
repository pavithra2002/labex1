/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
import java.util.Scanner;

/**
 *
 * @author PAVITHRA T
 */
public class convertdaystomonth {
    public static void main(String[] args) {
    System.out.println("enter the number of days");
    Scanner obj = new Scanner(System.in);
    int num=obj.nextInt();
    int days = num % 30;
    int month = num / 30;
    System.out.println(num + " days = " + month + " Month and " + days
    + " days");
}
}


