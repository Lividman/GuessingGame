import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessingGame
{
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What be your name young man and or woman and or B ");
		String s = input.next();
		System.out.println("Cool " + s + ", thats a pretty legit name");
		System.out.println("How old are you B");
		int n = input.nextInt();
		if(n > 20)
			System.out.println(n +", Thats pretty old young man");
		else
			System.out.println(n+ ", Thats pretty young young man");
		int ans = (int)(Math.random() * 10 + 1);
		int guess = -1;
		int count = 0;
		while (guess != ans)
		{
			try
			{
				System.out.println("What do you think the number is?");
				guess = input.nextInt();
				if(ans == guess)
				{
					count ++;
					System.out.println("cool you won in " + count + "tries");
				}
				else
				{
					count++;
					System.out.println("Not right young man try again lol");
				}
						
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("What you put is not an integer, try again");
				input.nextLine();
				count ++;
			}
		
		}
	}
}
