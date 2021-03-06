package chat.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Chatbot 
{
	private String askName;
	private String catResponse;
	private String hello; 
	private String howAreYou;
	private String niceToMeetYou;
	private String currentUser;
	private String good;
	private String bad;
	private String whatWasThat; 
	private String joke;
	private String content;
	private boolean legit = true;
	
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList; 

	
	public Chatbot()
	{
		this.askName = "What is your name?";
		this.catResponse = "I like cats. :)";
		this.hello = "Hello.";
		this.niceToMeetYou = "It is nice to meet you."; 
		this.howAreYou = "How are you doing this fine morning?";
		this.good = "That's good. :) ";
		this.bad = "That sucks. :( "; 
		this.whatWasThat = "I'm sorry, what did you say?"; 
		this.joke = "What did the baby robot call it's father? ... Data.";
		this.content = "Books";
		this.currentUser = "Friend.";
	
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
		
	}
	
	public boolean legitimacyChecker (String input)
	{
		boolean isValid = true;
		
		if(input == null)
		{
			isValid = false;
		}
		else if (input.length() < 2) 
		{
			isValid = false;
		}
		else if (input.contains("sdf") || input.contains ("jkl"))
		{
			isValid = false;
		}
		
		return isValid;
	}
	
	public boolean spookyChecker (String input)
	{
		boolean isValid = true;
		
		for (String spookyString: spookyList)
		{
			if(input.contains("Easter"))
			{
				isValid = false;
			}
		}
		
		return isValid;
	}
	
	public boolean contentChecker (String userText)
	{
		boolean isValid = false; 
		
		if (userText.equalsIgnoreCase(content))
		{
			JOptionPane.showMessageDialog(null, "You found my secret word! :D");
			isValid = true;
		}
		
		else if (userText.contains(" " + content + " "))
		{
			JOptionPane.showMessageDialog(null, "You found my secret word! :D");
			isValid = true; 
		}
		
		else if (userText.contains(" " + content + "."))
		{
			JOptionPane.showMessageDialog(null, "You found my secret word! :)");
			isValid = true;
		}
		
		else if (0 == userText.indexOf(content + " "))
		{
			isValid = false;
		}
		
		else if (userText.length() - content.length() == content.indexOf(content))
		{
			isValid = false;
		}
		
		//else if ()
		
		return isValid; 
	}
	
	public boolean testChatbotString (String content)
	{		
		boolean isValid = false;
		
		if (content == "Books.")
		{
			isValid = true; 
		}
		
		return isValid;
	}
	
	public Chatbot(String string)
	{
		content = "sample content";
		
	}
	
	
	public Chatbot(String askName, String catResponse, String content, String whatWasThat, String hello, String howAreYou, String niceToMeetYou, String currentUser, String good, String bad)
	{
		this.askName = askName; 
		this.catResponse = catResponse; 
		this.hello = hello; 
		this.niceToMeetYou = niceToMeetYou; 
		this.howAreYou = howAreYou;
		this.currentUser = currentUser;
		this.good = good;
		this.bad = bad;
		this.whatWasThat = whatWasThat; 
		this.joke = joke;
		this.content = content;
		
	
	}

	private void buildTheLists()
	{
		responseList.add("Hello!");
		responseList.add("How are you today?");
		responseList.add("Goodbye - no more talking!");
		responseList.add("That's not very nice.");
		responseList.add("Thank you.");
		responseList.add("You're welcome. :)");
		responseList.add("Who's there?"); 
		responseList.add("What was that?");
		responseList.add("Have a great day! :D");
		responseList.add(askName);
		responseList.add("What is your favorite color?");
		responseList.add("Do you have a favorite number? If so, what is it?");
		responseList.add("That's cool. :)");
		responseList.add("Why?"); 
		responseList.add("What would you do with a million dollars?"); 
		responseList.add("Why not?"); 
		
		spookyList.add("This is Halloween! Pumpkins scream in the dead of night.");
		spookyList.add("Boys and girls of every age, wouldn't you like to see something strange?");
		spookyList.add("Come with us and you will see, this our town of Halloween.");
		spookyList.add("I am the one hiding under your bed, teeth ground sharp and eyes glowing red."); 
		spookyList.add("I am the one hiding under your stairs, fingers like snakes and spiders in my hair.");
		spookyList.add("I am the shadow on the moon at night, filling your dreams to the brim with fright.");
		spookyList.add("I am the clown with the tearaway face, here in a flash and gone without a trace.");
		spookyList.add("I am the 'who' when you call 'Who's there?'."); 
		spookyList.add("Boo!"); 
		
	}
	
	public String processText(String userText)
	{
		String answer = " ";
		
		if(!legitimacyChecker(userText))
		{
			answer += "You said: null. You really should not send null.\n";
		}
		else
		{
			answer += "You said: " + userText + "\n";
			
			if (contentChecker(userText))
			{
				answer += "You said the special words! \n";
			}
		int randomIndex = (int) (responseList.size() * Math.random()); 
		answer += "Chatbot says: " + responseList.get(randomIndex) + "\n";
		}
		
		return answer;
		
		/* This was here, but I made it better thanks to Henrichsen. 
		int randomIndex = (int)(Math.random() * responseList.size());
		
		answer += "You said: " + userText + "Chatbot says: " + randomIndex;
		
		if (userText != null && userText.contains(content))
			{
			answer = answer + " You said the special words";
			}
		*/
	
	}
	
	public String getWhatWasThat()
	{
		return whatWasThat;
	}
	public String getJoke()
	{
		return joke;
	}
	public String getAskName()
	{
		return askName;
	}
	public String getCatResponse()
	{
		return catResponse;
	}
	public String getHello()
	{
		return hello;
	}
	public String getHowAreYou()
	{
		return howAreYou;
	}
	public String getNiceToMeetYou()
	{
		return niceToMeetYou;
	}
	public String getGood()
	{
		return good;
	}
	public String getBad()
	{
		return bad;
	}
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	public String getContent()
	{
		return content;
	}
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	
	
	
}
