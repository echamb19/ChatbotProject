package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Chatbot;

public class BotController
{

	private Chatbot simpleBot;
	
	public BotController()
	{
		
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
	
	
	
}
