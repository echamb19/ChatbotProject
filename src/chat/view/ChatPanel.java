package chat.view;

import javax.swing.*;
import chat.controller.ChatController; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.Color; 
import java.awt.Font;

public class ChatPanel extends JPanel
{
	private ChatController chatController; 
	private JLabel responseLabel; 
	private JButton responseButton;
	
	public ChatPanel(ChatController chatController)
	{
		super(); 
		
		this.chatController = chatController; 
		
		this.responseLabel = new JLabel("Hello, I am your friendly neighborhood Chatbot."); 
		
		setupPanel(); 
		setupLayout(); 
		setupListeners(); 
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}

}
