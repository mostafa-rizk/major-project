public class gamefile {
   public static void main(String args[]) {
      character Player = new character();
      character Christian = new character();
      Christian.name = "Christian Shawcross"; Christian.gender = "Male";
      character Aeden = new character();
      Aeden.name = "Aeden Stewart"; Aeden.gender = "Male";
      character Robin = new character();
      Robin.name = "Robin Melun"; Robin.gender = "Female";
   }
   public static class character {
      String name;
      String gender;
      int health;
   }
}
