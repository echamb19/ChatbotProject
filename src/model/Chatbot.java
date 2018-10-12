package model;

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
	
	public Chatbot()
	{
		this.askName = "What is your name?";
		this.catResponse = "I like cats. :)";
		this.hello = "Hello.";
		this.niceToMeetYou = "It is nice to meet you."; 
		this.howAreYou = "How are you doing this fine morning?";
		this.good = "That's good. :) ";
		this.bad = "That sucks. :( "; 
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
