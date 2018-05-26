import java.io.*;
import java.util.*;

public class gamefile {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      int gridSize = 3;
      String[][] grid = new String[gridSize][gridSize];
      grid[0][0] = "_"; grid[0][1] = "_"; grid[0][2] = "_";
      grid[1][0] = "_"; grid[1][1] = "_"; grid[1][2] = "_";
      grid[2][0] = "_"; grid[2][1] = "_"; grid[2][2] = "_";
      char userIcon, compIcon = 'a';
      String userChoice;
      int turn = 1;
      boolean gameComplete = false;
      System.out.println("Welcome to Tic-tac-toe. You will choose where to put your piece using letters and numbers to represent a grid system where the top left is the origin. For example, type 'A2' for first row and second column.");
      try {
         do {
            System.out.print("Would you like to be 'x' or 'o'? ");
            userIcon = kbReader.next(".").charAt(0);
            if (userIcon == 'x' || userIcon == 'X') {
               userIcon = 'x';
               compIcon = 'o';
               System.out.println("Your icon has been set to 'x'");
            }
            else if (userIcon == 'o' || userIcon == 'O') {
               userIcon = 'o';
               compIcon = 'x';
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
         compIcon = 'o';
      }
      while (!gameComplete) {
         System.out.print("  ");
         for (int z = 0; z < gridSize; z++) {
            System.out.print((z + 1) + " ");
         }
         System.out.println();
         for (int i = 0; i < gridSize; i++) {
            System.out.print((char)(i + 65) + " ");
            for (int x = 0; x < gridSize; x++) {
               System.out.print(grid[i][x]);
               if (x < 2) {
                  System.out.print("|");
               }
            }
            System.out.println();
         }
         if (turn != 1) {
            if (grid[1][1] != "_") {
               for (int j = 0; j < 3; j+= 2) {
                  for (int k = 0; k < 3; k+= 2) {
                     if (grid[j][k] != "_") {
                        if (j == 0) {
                           j = 2;
                        }
                        else {
                           j = 0;
                        }
                        if (k == 0) {
                           k = 2;
                        }
                        else {
                           k = 0;
                        }
                     }
                  }
               }
            }
         }
         else {
            Random r = new Random();
            int temp = r.nextInt(3-1) + 1;
            if (temp == 1) {
               grid[1][1] = Character.toString(compIcon);
            }
            else {
               temp = r.nextInt(5-1) + 1;
               switch (temp) {
                  case 1: grid[0][0] = Character.toString(compIcon); break;
                  case 2: grid[0][2] = Character.toString(compIcon); break;
                  case 3: grid[2][0] = Character.toString(compIcon); break;
                  case 4: grid[2][2] = Character.toString(compIcon); break;
               }
            }
         }
         turn++;
         //break;
      }
   }
}
