/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;
import java.util.Scanner;
/**
 *
 * @author Slavik
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("число едениц и десятков и сумма цифр ");
        Scanner scanner=new Scanner(System.in);
        int summ=0;
        int chislo=scanner.nextInt();
        int chislo2=chislo%10;
        int chislo3=chislo/10%10;
        System.out.println(chislo2+" единиц");
        System.out.println(chislo3+" десятков");
        while (chislo>0){
            summ+=chislo%10;
            chislo/=10;
        }
        System.out.print("сумма цифр "+summ);
    }
   
}