import java.util.Random;

public class excuses {
   public static void main(String[] args) {
      String[] excuses = {
         "My dog ate my homework",
         "I accidentally spilled coffee all over it",
         "I left it in my other pants",
         "I was abducted by aliens and they took my homework with them",
         "I'm protesting homework as an oppressive institution",
         "I'm on strike until my demands for better homework conditions are met"
      };
      Random rand = new Random();
      int index = rand.nextInt(excuses.length);
      System.out.println("Sorry, I can't turn in my homework. " + excuses[index]);
   }
}
