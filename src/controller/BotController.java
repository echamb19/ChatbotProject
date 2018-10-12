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
	}
	
	ArrayList<String> responseList = new ArrayList<String>();
	
	ArrayList<String> spookyList = new ArrayList<String>(); 
	
}
