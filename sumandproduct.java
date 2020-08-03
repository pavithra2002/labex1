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
public class sumandproduct {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.println("Digits Sum and Product");
System.out.println("-----------------------");
System.out.print("Enter Number: ");
int number = in.nextInt();
int remainder, sum=0, product=1;
for (int temp=number; temp!=0; temp = temp / 10){
remainder = temp % 10;
sum = sum + remainder;
product = product * remainder;
}
System.out.println("Sum of digits of Number '"+number+"'': "+sum);
System.out.println("Product of digits of Number '"+number+"'': "+product);
}
}
    
}
