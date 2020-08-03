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
public class digitcount {
    public static void main(String[] args){
    System.out.println("enter a decimal");
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int i=0,r;
    while(n>0)
    {
     r=n%10;
     i++;
     n=n/10;
    }
    if (i==1)
    System.out.printf("the decimal is of %d digit",i);
    else
    System.out.printf("the decimal is of %d digits",i);
    }
}
    
}
