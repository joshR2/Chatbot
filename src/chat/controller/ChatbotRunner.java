package chat.controller;

/**
 * Starts the Chatbot program
 * @author jrob2049
 *@ version 1.0 10/21/15
 */
public class ChatbotRunner 
{
	public static void main (String [] args)
	{
		ChatbotController myChatbotController = new ChatbotController();
		myChatbotController.start();
	}
}
