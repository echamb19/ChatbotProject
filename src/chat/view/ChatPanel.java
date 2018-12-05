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
	//private JLabel responseLabel; 
	private JButton chatButton;
	private JButton checkerButton; 
	private JButton loadButton; 
	private JButton saveButton; 
	private JTextField chatField; 
	private JTextArea chatArea; 
	private JScrollPane chatPane; 
	
	public ChatPanel(ChatController chatController)
	{
		super(); 
		
		this.chatController = chatController; 
		this.chatButton = new JButton("To Chat"); 
		this.checkerButton = new JButton("Checker");
		this.loadButton = new JButton("Load"); 
		this.saveButton = new JButton("Save"); 
		this.chatField = new JTextField(); 
		this.chatArea = new JTextArea(); 
		this.chatPane = new JScrollPane(); 
		
		//this.responseLabel = new JLabel("Hello, I am your friendly neighborhood Chatbot."); 
		
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
