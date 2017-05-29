/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.pkg105;

import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Anagrama {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String s1 = teclado.nextLine();
        String s2 = teclado.nextLine();
        int n,i;
        
        
        s1 = s1.replace( " " , "");
        s1 = s1.replace( "." , "");
        s1 = s1.replace( "," , "");
        s1 = s1.replace( "/" , "");
        s1 = s1.replace( "-" , "");
        s1 = s1.replace( "!" , "");
        s1 = s1.replace( "-" , "");
        
        s2 = s2.replace( " " , "");
        s2 = s2.replace( "." , "");
        s2 = s2.replace( "," , "");
        s2 = s2.replace( "/" , "");
        s2 = s2.replace( "-" , "");
        s2 = s2.replace( "!" , "");
        s2 = s2.replace( "-" , "");
        
        char[] palavra = s1.toCharArray();
        
        if(s1.length()==s2.length()){ //se forem do mesmo tamanho entra aqui
            for (i=0; i<s1.length(); i++){ //percorrendo s1
                n=s2.indexOf(palavra[i]);//n recebe um numero positivo se encontrar a letra "i" em s2
                if(n==-1){ // se nao tiver 
                    System.out.println(s1+" NAO é um anagrama para "+s2); // não é anagrama
                    break;//e para aqui
                }
                if((i==s1.length()-1)&&(n>=0)){ //se encontrar e for a ultima letra 
                    System.out.println(s1+" É um anagrama para "+s2); // então é anagrama
                }
            }
        }else{
            System.out.println(s1+" NAO é um anagrama para "+s2); //se nao forem do mesmo tamanho entra aqui
        }

    }
}
