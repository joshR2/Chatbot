package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ChatbotView 
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatbotView()
	{
		windowMessage = "Hello from your friendly chatbot :D";
		chatIcon = new ImageIcon(getClass().getResource("images/NyanCat.png"));
		
	}
	
	public void showResponse(String wordsFromSomewhere)
	{
		
		
		JOptionPane.showMessageDialog(null,wordsFromSomewhere,windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon);
	
	
	}
	
	public String grabUserInput(String displayText)
	{
		String userInput = "";
		
		userInput = JOptionPane.showInputDialog(null,displayText,windowMessage,JOptionPane.INFORMATION_MESSAGE, chatIcon,null, "Type Here :)").toString();
		
		return userInput;
	}

}
