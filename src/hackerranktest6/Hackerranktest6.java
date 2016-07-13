/*
 * 
Task 
Given a string,S , of length N that is indexed from 0 to N - 1 , print its even-indexed and odd-indexed characters as  
space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format

The first line contains an integer, T (the number of test cases). 
Each line  i of the T subsequent lines contain a String, S.

Constraints
    1 <= T <= 10
    2 <= length of S <= 10000

 */

package hackerranktest6;

import java.util.Scanner;

/**
 *
 * @author besthon1
 */
public class Hackerranktest6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please, enter the number of word(s): ");
        
        int numberOfLoops = scanner.nextInt();
         
         
         for (int j = 0; j < numberOfLoops; j++)
         {
                System.out.print("Please, enter the actual word: ");
                
                String wordTypedByUser = scanner.next();

                char[] word = wordTypedByUser.toCharArray();

                StringBuilder charFromEvenIndex = new StringBuilder();

                StringBuilder charFromOddIndex = new StringBuilder();

                for (int i = 0; i < word.length; i++)
                {
                    if (i % 2 == 0)
                    {
                        charFromEvenIndex.append(word[i]);
                    }
                    else
                    {
                        charFromOddIndex.append(word[i]);
                    }
                }

                System.out.print(charFromEvenIndex + " ");

                System.out.println(charFromOddIndex);

        }
    
    }
    
}
