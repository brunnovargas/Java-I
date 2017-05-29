/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg106;

import java.text.Normalizer;
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
        String s2 = "";
        
        s1 = s1.replace( " " , "");
        s1 = s1.replace( "." , "");
        s1 = s1.replace( "," , "");
        s1 = s1.replace( "/" , "");
        s1 = s1.replace( "-" , "");
        s1 = s1.replace( "!" , "");
        s1 = s1.replace( "-" , "");
        s1 = s1.replace( "Ô" , "O");

        for(int i=s1.length()-1; i>=0;i--){
            s2+=s1.charAt(i);
        }
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("É Palindromo!!!");
        }else{
            System.out.println("NÃO É palindromo!!!");
        }
   
    }
  
}


