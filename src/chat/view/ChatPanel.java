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
		
		this.chatButton = new JButton("Chat");
		this.checkerButton = new JButton("Check Text");
		this.loadButton = new JButton("Load");
		this.saveButton = new JButton("Save");
		this.chatField = new JTextField("Talk to the bot here.", 50);
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
		chatButton.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent mouseClick)
				{
					
				}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent mouseClick)
				{
					
				}
		});
		
		loadButton.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent mouseClick)
				{
					
				}
		});
		
		checkerButton.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent mouseClick)
				{
			
				}
		});
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -58, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -48, SpringLayout.EAST, this);

		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 47, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, -612, SpringLayout.EAST, this);

		appLayout.putConstraint(SpringLayout.WEST, loadButton, 47, SpringLayout.EAST, checkerButton);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, -58, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -424, SpringLayout.EAST, this);

		appLayout.putConstraint(SpringLayout.WEST, saveButton, 47, SpringLayout.EAST, loadButton);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -236, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 47, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -58, SpringLayout.SOUTH, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 39, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 39, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 39, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 39, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, 112, SpringLayout.SOUTH, chatField);

		appLayout.putConstraint(SpringLayout.NORTH, chatField, 30, SpringLayout.SOUTH, chatPane);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, chatPane);
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
