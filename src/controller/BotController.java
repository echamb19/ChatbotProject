package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Chatbot;

public class BotController
{

	public void start()
	{
		String userInput = "Something.";
		while(!userInput.equalsIgnoreCase ("quit"))
		{
			userInput = JOptionPane.showInputDialog (null, "If you want me to stop, type 'quit'.");
		}
		
		interactWithChatbot();
	} 
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "Hi. What's up?");
		
		return output;
	}
	
	public String processText(String userText)
	{
		String answer = "";
		answer += "You said: " + userText;
		output = simpleBot.processText(userResponse);
		return answer;
	}
	
	ArrayList<String> responseList = new ArrayList<String>();
	
	ArrayList<String> spookyList = new ArrayList<String>(); 
	
}
