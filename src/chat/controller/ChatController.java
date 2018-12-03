package chat.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import chat.model.Chatbot;

public class ChatController
{

	private Chatbot simpleBot;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
	}
	
	public void start()
	{
		String userInput = "";
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = JOptionPane.showInputDialog(null, "If you want me to stop, type 'quit'.");
			
		}
		
		if(userInput.equals (null))
		{
			JOptionPane.showMessageDialog(null, "You must enter something.");
		}
	} 
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog (null, "If you want me to stop, type 'quit'.");
		output = simpleBot.processText(userResponse);
		
		if(text == (null))
		{
			output += ("Don't input null! :(");
		}
		
		return output;
	} 
	
	public boolean useChatbotCheckers (String input)
	{
		boolean isTrue = true; 
		
		if (input == (null)) 
		{
			//String output += ("Don't input null! :(");
			isTrue = false;
		}
		
		return isTrue;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot; 
	}
	
	public boolean interactWithChatbot ()
	{
		boolean isValid = false;
		
		
		
		return isValid;
	}
	
}
