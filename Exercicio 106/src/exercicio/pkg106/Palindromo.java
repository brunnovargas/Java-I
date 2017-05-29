/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg106;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        String s1 = teclado.nextLine();
        
        s1 = s1.replace( " " , "");
        s1 = s1.replace( "." , "");
        s1 = s1.replace( "," , "");
        s1 = s1.replace( "/" , "");
        s1 = s1.replace( "-" , "");
        s1 = s1.replace( "!" , "");
        s1 = s1.replace( "-" , "");
        
        
        int t = s1.length();
        int j=0;
        int i=t;
       
               
       while((s1.charAt(i))==(s1.charAt(j))){
           i++;
           j--;
        
       }
       System.out.println("palindromo!!!");

    }

}
