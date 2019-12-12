/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1- codifica un programa que saque, por consola, 
        //un número tecleado, sempre que sexa positivo,xunto coa mensaxe “ e positivo “ .
        
        Boletin6_1 num1 = new Boletin6_1();
        Scanner sc = new Scanner(System.in);   
        System.out.println("dame un numero:");
         int num2 = sc.nextInt();        
         num1.ComprobarNUmero(num2);
        
         /*2- Implementa un programa no que se tecleen dous números de tipo short 
         . Se o primeiro é maior ou igual que o segundo,visualizaremos a resta . 
         En calquera caso visualizaremos a suma .*/
        
        
        
    }
    
}
