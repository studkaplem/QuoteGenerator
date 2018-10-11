import java.util.ArrayList;

public class Database
	{
		static ArrayList<Quote>list= new ArrayList<Quote>();
		public static void fillList()
			{
				list.add(new Quote("inspirational", "Life is like photography, you use the negatives to develop."));
				list.add(new Quote("Sarcastic", "Sarcasm helps keep you from telling people what you really think of them."));
				list.add(new Quote("Moronic", "I don't think I'm going to lose, but if I do, I don't think you're ever going to see me again, folks. I think I'll go to Turnberry and play golf or something."));
			}
	}
