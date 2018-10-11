
public class Quote
	{
		String type, phrase;
		
		public Quote (String t, String p)
			{
				type = t;
				phrase = p;
			}

		public String getType()
			{
				return type;
			}

		public void setType(String type)
			{
				this.type = type;
			}

		public String getPhrase()
			{
				return phrase;
			}

		public void setPhrase(String phrase)
			{
				this.phrase = phrase;
			}
		
	}
