/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromos;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class Palindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Stack stack = new Stack(); 
        System.out.println("Introduce la palabra: ");
        Scanner teclado = new Scanner(System.in);
        String input = teclado.nextLine();
        
        
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }
        
        String palindromo = "";
        
        while(!stack.isEmpty()){
            palindromo = palindromo+stack.pop();
        }
        
        if(input.equals(palindromo))
            System.out.println("La palabra es un palindromo");
        else
            System.out.println("La palabra no es un palindromo");
    }

}
    

