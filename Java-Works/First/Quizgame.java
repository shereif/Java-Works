import java.util.*;

public class Quizgame
{
  public static int Decision()
  {
    Scanner choose = new Scanner(System.in);
    System.out.println("*****Choose a difficulty level*****");
    System.out.println("**   1 - Addition problems       **");
    System.out.println("**   2 - Subtraction problems    **");
    System.out.println("**   3 - Multiplication problems **");
    System.out.println("**   4 - Division problems       **");
    System.out.println("**   5 - All                     **");

    int grab = choose.nextInt();
    switch (grab) {
      case 1 : System.out.println("You have chosen 1 Addition problems");
               break;
      case 2 : System.out.println("You have chosen 2 Subtraction problems");
               break;
      case 3 : System.out.println("You have chosen 3 Multiplication problems");
               break;
      case 4 : System.out.println("You have chosen 4 Division problems");
               break;
      case 5 : System.out.println("You have chosen 5 All problems");
               System.out.println("Prepare to get rekt \n");
               break;
    }
    return grab;

  }
  public static void main(String[] args)
  {
    int choice = test.Decision();
    if (choice >= 6 || choice <= 0 ) {
      System.out.println("Can not have a difficulty level greater than 6 or less than 0");
      return;
    }
    boolean a = false;
    int Correct = 0;
    int Incorrect = 0;
    while (!a) {
      Random rand = new Random();
      int mynum = rand.nextInt(4) + 1;
      System.out.println("How much is 6 times 7?");

      Scanner reader = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = reader.nextInt();

      if (n != 42) {
        switch (mynum) {
          case 1: System.out.println("No, sorry please try again\n");
          Incorrect += 1;
          break;
          case 2: System.out.println("Wrong. Try once more\n");
          Incorrect += 1;
          break;
          case 3: System.out.println("Don't give up!\n");
          Incorrect += 1;
          break;
          case 4: System.out.println("No. Keep trying.\n");
          Incorrect += 1;
          break;
        }
        continue;
      }
      else{
        switch (mynum){
          case 1: System.out.println("Correct!");
          Correct += 1;
          a = !a;
          break;
          case 2: System.out.println("Good job!");
          Correct += 1;
          a = !a;
          break;
          case 3: System.out.println("Great answer");
          Correct += 1;
          a = !a;
          break;
          case 4: System.out.println("Gucci!");
          Correct += 1;
          a = !a;
          break;
        }
      }
    }
    System.out.println("The total # of Correct answers is " + Correct);
    System.out.println("The total # of Incorrect answers is " + Incorrect);

  }
}
