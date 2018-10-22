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
		String userInput = "Something.";
		while(!userInput.equalsIgnoreCase ("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
	} 
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog (null, "If you want me to stop, type 'quit'.");
		output = simpleBot.processText(userResponse);
		return output;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot; 
	}
	
}
