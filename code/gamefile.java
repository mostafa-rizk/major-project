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
      int turn = 0, lastMoveX, lastMoveY;
      String currentIcon;
      boolean gameComplete = false, computerMoved;
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
         turn++;
         computerMoved = false;
          if (turn == 1) { //Deciding computer's first move
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
         else {
            if (grid[1][1] != "_") { //Checking for special pattern
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
                        computerMoved = true;
                     }
                  }
               }
            }
            else if (!computerMoved){
               for (int k = 0; k < 3; k++) {
                  currentIcon = grid[1][k];
                  if (k != 1) { //Check if on either row 1 or 3
                     if (grid[0][k] == currentIcon || grid[2][k] == currentIcon || grid[0][k] == grid[2][k]) { //Row
                        for (int i = 0; i < 3; i++) {
                           if (grid[i][k] == "_") {
                              grid[i][k] = Character.toString(compIcon);
                              computerMoved = true;
                           }
                        }
                     }
                  }
                  else {
                     if (grid[k-1][k] == currentIcon || grid[k+1][k] == currentIcon || grid[k-1][k] == grid[k+1][k]) { //Row
                        for (int i = 0; i < 3; i++) {
                           if (grid[i][k] == "_") {
                              grid[i][k] = Character.toString(compIcon);
                              computerMoved = true;
                           }
                        }
                     }
                     else if (grid[k][k-1] == currentIcon || grid[k][k+1] == currentIcon || grid[k][k-1] == grid[k][k+1]) { //Column
                        for (int i = 0; i < 3; i++) {
                           if (grid[k][i] == "_") {
                              grid[k][i] = Character.toString(compIcon);
                              computerMoved = true;
                           }
                        }
                     }
                     else if (grid[k-1][k-1] == currentIcon || grid[k+1][k+1] == currentIcon || grid[k-1][k-1] == grid[k+1][k+1]) { //Backslash
                        for (int i = 0; i < 3; i++) {
                           if (grid[i][i] == "_") {
                              grid[i][i] = Character.toString(compIcon);
                              computerMoved = true;
                           }
                        }
                     }
                     else if (grid[k-1][k+1] == currentIcon || grid[k+1][k-1] == currentIcon || grid[k-1][k+1] == grid[k+1][k-1]) { //Forward slash
                        for (int i = 0, i2 = 2; i > 3; i++) {
                           if (grid[i][i2] == "_") {
                              grid[i][i2] = Character.toString(compIcon);
                              computerMoved = true;
                           }
                           i2--;
                        }
                     }
                     else { //Colum -1
                        currentIcon = grid[k-1][k];
                        if (grid[k-1][k-1] == currentIcon || grid[k-1][k+1] == currentIcon || grid[k-1][k-1] == grid[k-1][k+1]) {
                           for (int i = 0; i < 3; i++) {
                              if (grid[k-1][i] == "_") {
                                 grid[k-1][i] = Character.toString(compIcon);
                                 computerMoved = true;
                              }
                           }
                        }
                        else { //Column +1
                           currentIcon = grid[k+1][k];
                           if (grid[k+1][k-1] == currentIcon || grid[k+1][k+1] == currentIcon || grid[k+1][k-1] == grid[k+1][k+1]) {
                              for (int i = 0; i < 3; i++) {
                                 if (grid[k+1][i] == "_") {
                                    grid[k+1][i] = Character.toString(compIcon);
                                    computerMoved = true;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               if (!computerMoved) {
                  
               }
            }
         }
         //break;
      }
   }
}
