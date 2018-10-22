package chat.model;

import java.util.ArrayList;

public class Chatbot 
{
	private String askName;
	private String catResponse;
	private String hello; 
	private String howAreYou;
	private String niceToMeetYou;
	private String userName;
	private String good;
	private String bad;
	private String whatWasThat; 
	private String joke;
	
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
	
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
		
	}
	
	public Chatbot(String askName, String catResponse,String whatWasThat, String hello, String howAreYou, String niceToMeetYou, String userName, String good, String bad)
	{
		this.askName = askName; 
		this.catResponse = catResponse; 
		this.hello = hello; 
		this.niceToMeetYou = niceToMeetYou; 
		this.howAreYou = howAreYou;
		this.userName = userName;
		this.good = good;
		this.bad = bad;
		this.whatWasThat = whatWasThat; 
		this.joke = joke;
		
	
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello! How re you?");
		responseList.add("Goodbye - no more talking!");
		responseList.add("That's not very nice.");
		responseList.add("Thank you.");
		responseList.add("You're welcome. :)");
		responseList.add("Who's there?"); 
		
		spookyList.add("I am the one hiding under your bed, teeth grown sharp and eyes glowing red."); 
		spookyList.add("I am the one hiding under your stairs, fingers like snakes and spiders in my hair.");
		spookyList.add("I am the shadow on the moon at night, filling your dreams to the brim with fright.");
		spookyList.add("I am the 'who' when you call 'Who's there?'.");
	}
	
	public String processText(String userText)
	{
		String answer = "";
		answer += "You said: " + userText;
		return answer;
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
	public String getUserName()
	{
		return userName;
	}
	public String getGood()
	{
		return good;
	}
	public String getBad()
	{
		return bad;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	
	
}
