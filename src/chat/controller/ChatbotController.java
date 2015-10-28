package chat.controller;

import chat.view.ChatbotView;
import chat.model.Chatbot;

/**
 * Application controller for the Chatbot project.
 * @author jrob2049
 *@version 1.11 10/21/15		added a reference to display and got an error :( 
 */


public class ChatbotController 
{
	
	private ChatbotView myDisplay;
	private Chatbot myBot;
	
	public ChatbotController()
	{
		myDisplay = new ChatbotView();
		String userName = myDisplay.grabAnswer("What is your name?");
		myBot = new Chatbot(userName);
		
	}
	
	public void start()
	{
		myDisplay.grabAnswer("hello" + myBot.getUserName());
		chat();
	}
	
	private void chat()
	{
		String conversation = myDisplay.grabAnswer("What would you like to talk about today?");
		while(myBot.lengthChecker(conversation));
//		{
//			if(!simepleBot.quitChecker(conversation))
//			{
//				conversation = simpleBot.processInput(conversation)
//			}
//			else
//			{
//				shutDown();
//			}
//			conversation = display.collectUserText(conversation);
//		}
			
	}
	
	private void shutdown()
	{
		
	}
}
