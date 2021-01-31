/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;
import java.util.Scanner;
/**
 *
 * @author WHITEKABAR
 */
public class JavaApplication61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n; char y='a';
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter n");
        n = input.nextInt();
        for (int i=n; i<100; i*=2 ) {
            System.out.println(i);
        }
        for (char d='a'; d<='z'; d++) {
            System.out.println(d);
        }
        for (int i=0, j=10; i<=j; i++, j--) { 
            System.out.println(i+","+j);
        }
    }
    
}
