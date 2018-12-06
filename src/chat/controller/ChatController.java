package chat.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import chat.view.ChatFrame;

import chat.model.Chatbot;

public class ChatController
{
	private ChatFrame chatFrame;
	private Chatbot simpleBot;

	public ChatController()
	{
		chatFrame = new ChatFrame(this);
		simpleBot = new Chatbot();
	}
	
	public void start()
	{
		/*String userInput = "";
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = JOptionPane.showInputDialog(null, "If you want me to stop, type 'quit'.");
			
		}
		
		if(userInput.equals (null))
		{
			JOptionPane.showMessageDialog(null, "You must enter something.");
		}*/
	} 
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		//String userResponse = JOptionPane.showInputDialog (null, "If you want me to stop, type 'quit'.");
		//output = simpleBot.processText(userResponse);
		/*if(text == (null))
		{
			output += ("Don't input null! :(");
		}*/
		output+= simpleBot.processText(text);
		return output;
	} 
	
	public String useChatbotCheckers (String text)
	{
		String testedValues = "The following chechers passed:";
		if (simpleBot.contentChecker(text))
		{
			testedValues += "\nContent Checker";
		}
		if(simpleBot.spookyChecker(text))
		{
			testedValues += "\nSpooky Checker Happy Halloween";
		}
		if (simpleBot.legitimacyChecker(text))
		{
			testedValues += "\nValidity Checker";
		}
		return testedValues;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot; 
	}
	
}
