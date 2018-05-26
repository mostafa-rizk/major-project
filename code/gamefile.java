import java.io.*;
import java.util.*;

public class gamefile {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      character Player = new character();
      Player.name = "";
      character Christian = new character();
      Christian.name = "Christian Shawcross"; Christian.gender = "Male";
      character Aeden = new character();
      Aeden.name = "Aeden Stewart"; Aeden.gender = "Male";
      character Robin = new character();
      Robin.name = "Robin Melun"; Robin.gender = "Female";
      do {
         System.out.print("What is the name of your character? ");
         Player.name = input.next();
         if (Player.name.length() > 20) {
            System.out.println("Your character's name must be less than 20 characters");
         }
         if (Player.name.matches(".*\\d+.*")) {
            System.out.println("Your character's name cannot have numbers in it");
         }
      }
      while (Player.name.length() > 20 || Player.name.matches(".*\\d+.*"));
      System.out.println(Player.name);
   }
   public static class character {
      String name;
      String gender;
      int health;
   }
}
