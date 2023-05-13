
import java.util.Scanner;
import java.util.Random;

class Main 
{
  public static void main(String[] args) 
  {
    nim(12);
  }

  public static void nim(int sticks) 
  {
    System.out.println("Let's start playing!");
    System.out.println("The computer will start.");

    while (sticks > 0)
      {
        Random rand = new Random(); 
        int computerSticks = rand.nextInt(4) + 1;

        while (computerSticks > sticks)
        {
          int newComputerSticks = rand.nextInt(4) + 1;
          computerSticks = newComputerSticks;
        }
        sticks = sticks - computerSticks;

        System.out.println("The computer took " + computerSticks+ " sticks");

        System.out.println("There are " + sticks + " sticks left");

        if (sticks == 0) 
        {
          System.out.println("The computer wins!");
          return;
        }
        
        
        System.out.println("Your turn.");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

          while (input <= 0 || input > 4 || input > sticks)
          {
            System.out.println("Invalid input. Enter a number between 1 and 4");
            int newInput = in.nextInt();
            input = newInput;
          }
          if (input >= 1 && input <= 4 && input <= sticks)
          {
            int playerSticks = input;
            sticks = sticks - playerSticks;
            System.out.println("You took " + playerSticks + " sticks");
            System.out.println("There are " + sticks + " sticks left");
          }

          if (sticks == 0) 
          {
            System.out.println("You win!");
            return;
          }
      }
    }
}