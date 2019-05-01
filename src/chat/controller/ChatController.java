package chat.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import chat.view.ChatFrame;
import chat.model.ChatTwitter;

import chat.model.Chatbot;

public class ChatController
{
	private ChatFrame chatFrame;
	private Chatbot simpleBot;
	private ChatTwitter myTwitter;

	public ChatController()
	{
		chatFrame = new ChatFrame(this);
		simpleBot = new Chatbot();
		myTwitter = new ChatTwitter(this); 
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
	
	public void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(chatFrame, error.getMessage());
	}
	
	public ChatFrame getAppFrame()
	{
		return chatFrame;
	}
	
	public void tweet(String text)
	{
		myTwitter.sendTweet(text); 
	}
	
	public String findWords(String user)
	{
		String results = myTwitter.getMostCommonWord(user); 
		return results; 
	}
}
