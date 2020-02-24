/*
 * Anton dela Cruz
 * February 24, 2020
 * This program determines whether or not user input is a palindrome
 */
package palindrome;

import javax.swing.*;
/**
 *
 * @author antde
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Prompt for user input
        String input = JOptionPane.showInputDialog("Enter a word you wish the program verify is a palindrome or not");
        
        //Initialize String in reverse form
        String reverse = "";
        
        //Determine length of user Input
        int length = input.length();
        
        for (int i = length - 1; i >= 0; i--){
            //Reverse string is compared with the input String in order from last to first characters
            //Continues to loop for every character in input
            
            reverse = reverse + input.charAt(i);
        }
        //Output states whether or not user input is a palindrome
        
        if (reverse.equals(input)){
            System.out.println("The input IS a palindrome");
            System.out.println("The reverse of " + input + " is " + reverse);
        } else{
            System.out.println("The input is NOT a palindrome");
            System.out.println("The reverse of " + input + " is " + reverse);
        }
    }
    
}
    