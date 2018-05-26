import java.io.*;
import java.util.*;

public class gamefile {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      character Player = new character(); //Initializing characters
      character Christian = new character();
      Christian.name = "Christian Shawcross"; Christian.gender = "Male";
      character Aeden = new character();
      Aeden.name = "Aeden Stewart"; Aeden.gender = "Male";
      character Robin = new character();
      Robin.name = "Robin Melun"; Robin.gender = "Female";
      String choice = "";
      do { //Asking user to give name to player
         System.out.print("What is the name of your character? ");
         Player.name = input.nextLine();
         if (Player.name.length() > 20) {
            System.out.println("Your character's name must be less than 20 characters");
         }
         if (Player.name.matches(".*\\d+.*")) {
            System.out.println("Your character's name cannot have numbers in it");
         }
      }
      while (Player.name.length() > 20 || Player.name.matches(".*\\d+.*"));
      System.out.printf("The year is 2018. You are special investigator %s. After rumors spread that famous " +
      "hacker, %s, is involved in shady dealings, you are hired to investigate his mansion. Good luck!\n",
      Player.name, Christian.name);
      System.out.println("You arrive outside the mansion, but your path is blocked by iron gates. What will you do?" +
      "\n1.Jump over the fence \n2. Break the lock \n3. Push the gate open \n4. Look around");
      switch (choice) {
         
      }
   }
   public static class character { //Character class
      String name;
      String gender;
      int health;
   }
}
