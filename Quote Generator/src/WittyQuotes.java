import java.util.Scanner;

public class WittyQuotes
	{
		static Scanner userInput = new Scanner(System.in);
		static String name;
		static int number;
		public static void main (String[] args)
			{
				Database.fillList();
				userWelcome();
				quoteGenerator();
			}
		public static void userWelcome()
			{
				System.out.println("What's your name?");
				name = userInput.nextLine();
				System.out.println("Welcome " + name + "! This is a speech topic idea chooser");
			}
		public static void quoteGenerator()
			{
				System.out.println("What kind of quote do you want: sarcastic, moronic or inspirational");
				String answer = userInput.nextLine();
				int randomNumber = (int)(Math.random()*Database.list.size());
				if (answer.toLowerCase().equals("sarcastic"))
					{
						System.out.println("Okay " + name + " your quote is " + Database.list.get(randomNumber).getPhrase());
					}
				else if (answer.toLowerCase().equals("moronic"))
					{
						
					}
				else if (answer.toLowerCase().equals("inspirational"))
					{
						
					}
			}
	}
