/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi;

import java.util.Scanner;

/**
 *
 * @author Dell E7450 i5
 */
public class Fibonachi {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numOfDigits;
                        
        Scanner MySc = new Scanner(System.in);
        String userInput;
        int firstNum = 0, secNum = 1;
        
        
        do{
            System.out.println("How many numebers from the Fibonacci sequence would you like to see?");
            userInput = MySc.nextLine();
            
            if(!userInput.matches("[0-9]+")){
                System.out.println("Invalid input");
            }
            
        } while (!userInput.matches("[0-9]+") );
        
        numOfDigits = Integer.parseInt(userInput);
    
                     
       if(numOfDigits > 2) { 
           System.out.print(" 0, 1, ");
       
       
       for (int curNum = 1; curNum <= numOfDigits-2; curNum++) {
        
        long nextNum = firstNum + secNum;
        
        System.out.print(nextNum + ", ");
        
        firstNum = secNum;
        secNum = (int)nextNum;
        
    } // end of for loop
            
        } else if(numOfDigits == 2) {
    
            System.out.print("0, 1");
            
       }else {
            System.out.print("0");
}
               
    }
}
    
