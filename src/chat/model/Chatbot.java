package chat.model;

import java.util.ArrayList;

/**
	 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
	 * of the project.
	 * @author Cody Henrichsen
	 * @version 1.1 10/23/15 Completed the lengthChecker method. Fixed the constructor and getter for userName.
	 */
	public class Chatbot
	{
		private ArrayList<String> memesList;
		private ArrayList<String> politicalTopicList;
		private String userName;
		private String content;
		
		/**
		 * Creates an instance of the Chatbot with the supplied username.
		 * @param userName The username for the chatbot.
		 */
		public Chatbot(String userName)
		{
			this.memesList = new ArrayList<String>();
			this.politicalTopicList = new ArrayList<String>();
			this.userName = userName;
			this.content = "Motivational Sigh!";
			
			buildMemesList();
			buildPoliticalTopicsList();
		}
		
		private void buildMemesList()
		{
			// me gusta,troll,what if i told you,Spooderman,doge,bad luck brian,cute animals,pepe putin,"aliens",unhelpful teacher
			this.memesList.add("cute animals");
			this.memesList.add("doge");
			this.memesList.add("me gusta");
			this.memesList.add("troll");
			this.memesList.add("what if i told you");
			this.memesList.add("spooderman");
			this.memesList.add("bad luck brian");
			this.memesList.add("pepe putin");
			this.memesList.add("aliens");
			this.memesList.add("unhelpful teacher");
		}
		
		private void buildPoliticalTopicsList()
		{
			
		}
		
		/**
		 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
		 * otherwise returns true. 
		 * @param currentInput
		 * @return A true or false based on the length of the supplied String.
		 */
		public boolean lengthChecker(String currentInput)
		{
			boolean hasLength = false;
			
			if(currentInput != null )
			{
				if(currentInput.length() >= 1)
				{
					hasLength = true;
				}
				
				if(currentInput != null && currentInput.length() > 0)
				{
					hasLength = true;
				}
			}
			
			return hasLength;
		}
		
		/**
		 * Checks if the supplied String matches the content area for this Chatbot instance.
		 * @param currentInput The supplied String to be checked.
		 * @return Whether it matches the content area.
		 */
		public boolean contentChecker(String currentInput)
		{
			boolean hasContent = false;
			
			if(currentInput.toLowerCase().contains(content))
			{
				hasContent = true;
			}
			return hasContent;
		}
		
		/**
		 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
		 * true if it does find a match and false if it does not match.
		 * @param currentInput The supplied String to be checked.
		 * @return Whether the String is contained in the ArrayList.
		 */
		public boolean politicalTopicChecker(String currentInput)
		{
			return false;
		}
		
		
		/**
		 * Checks to see that the supplied String value is in the current memesList variable.
		 * @param currentInput The supplied String to be checked.
		 * @return Whether the supplied String is a recognized meme.
		 */
		public boolean memeChecker(String currentInput)
		{
			boolean hasMeme = false;
			
			for (String currentMeme : memesList)
			{
				if(currentMeme.equalsIgnoreCase(currentInput))
				{
					hasMeme = true;
				}
			}
			
			return hasMeme;
		}
		
		/**
		 * Returns the username of this Chatbot instance.
		 * @return The username of the Chatbot.
		 */
		public String getUserName()
		{
			return userName;
		}
		
		/**
		 * Returns the content area for this Chatbot instance.
		 * @return The content area for this Chatbot instance.
		 */
		public String getContent()
		{
			return null;
		}
		
		/**
		 * Getter method for the memesList object.
		 * @return The reference to the meme list.
		 */
		public ArrayList<String> getMemesList()
		{
			return null;
		}
		
		/**
		 * Getter method for the politicalTopicList object.
		 * @return The reference to the political topic list.
		 */
		public ArrayList<String> getPoliticalTopicList()
		{
			return null;
		}
		
		/**
		 * Updates the content area for this Chatbot instance.
		 * @param content The updated value for the content area.
		 */
		public void setContent(String content)
		{
			
		}
	
}
