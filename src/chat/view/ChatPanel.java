package chat.view;

import javax.swing.*;
import java.awt.Dimension; 
import chat.controller.ChatController; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.Color; 
import java.awt.Font;

public class ChatPanel extends JPanel
{
	private ChatController chatController; 
	//private JLabel responseLabel; 
	private SpringLayout appLayout; 
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
		appLayout = new SpringLayout(); 
		
		this.chatButton = new JButton("To Chat"); 
		this.checkerButton = new JButton("Check Text");
		this.loadButton = new JButton("Load"); 
		this.saveButton = new JButton("Save"); 
		
		this.chatField = new JTextField("Talk to the bot here.", 50); //columns not x value
		this.chatArea = new JTextArea("Chat Area", 20, 50); 
		this.chatPane = new JScrollPane(); 
		
		//this.responseLabel = new JLabel("Hello, I am your friendly neighborhood Chatbot."); 
		
		setupScrollPane(); 
		setupPanel(); 
		setupLayout(); 
		setupListeners(); 
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600)); 
		this.setBackground(Color.BLUE); 
		this.add(chatPane); 
		this.add(chatButton); 
		this.add(saveButton); 
		this.add(loadButton); 
		this.add(checkerButton); 
		this.add(chatField); 
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}

	private void setupScrollPane()
	{
		chatArea.setEditable(false); //Can't type into it
		chatArea.setLineWrap(true); 
		chatArea.setWrapStyleWord(true); 
		
		chatPane.setViewportView(chatArea); 
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
	}
}
