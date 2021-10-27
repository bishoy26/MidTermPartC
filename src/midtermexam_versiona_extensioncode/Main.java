package midtermexam_versiona_extensioncode;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
import java.util.Scanner;
public class Main
{
   public static void main (String args[])
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Name: ");
      String name = input.nextLine();

      System.out.println("Choose one of the following genres: Comedy, Drama,Action, Mystery");

      String genre = input.nextLine();
      TestUserprofile user1 = new TestUserprofile(name, genre);

      System.out.println("User " + user1.getName() + "has been created.");

   }
}
