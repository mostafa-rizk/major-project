import java.io.*;
import java.util.*;

public class gamefile {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      char userIcon;
      System.out.println("Welcome to Tic-tac-toe. You will choose where to put your piece using letters and numbers to represent a grid system where the top left is the origin. For example, type 'A2' for first row and second column.");
      try {
         do {
            System.out.print("Would you like to be 'x' or 'o'? ");
            userIcon = kbReader.next(".").charAt(0);
            if (userIcon == 'x' || userIcon == 'X') {
               userIcon = 'x';
               System.out.println("Your icon has been set to 'x'");
            }
            else if (userIcon == 'o' || userIcon == 'O') {
               userIcon = 'o';
               System.out.println("Your icon has been set to 'o'");
            }
            else {
               System.out.println("You need to type either 'x' or 'o' to choose your icon");
            }
         }
         while (userIcon != 'x' && userIcon != 'X' && userIcon != 'o' && userIcon != 'O');
      }
      catch (Exception e) {
         System.out.println("You entered an invalid input. A default icon of 'x' has been chosen for you");
         userIcon = 'x';
      }
   }
}
