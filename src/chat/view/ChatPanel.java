package chat.view;

import javax.swing.*;
import java.awt.Dimension; 
import chat.controller.ChatController; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.Color; 
import java.awt.Font;
import chat.controller.IOController;

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
	private JButton resetButton; 
	
	public ChatPanel(ChatController chatController)
	{
		super(); 
		
		this.chatController = chatController; 
		appLayout = new SpringLayout(); 
		
		this.resetButton = new JButton("Reset");
		appLayout.putConstraint(SpringLayout.WEST, resetButton, 350, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, resetButton, -58, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, resetButton, -353, SpringLayout.EAST, this);
		this.chatButton = new JButton("Chat");
		
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -58, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -55, SpringLayout.EAST, this);
		this.loadButton = new JButton("Load");
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, -58, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -52, SpringLayout.WEST, resetButton);
		this.saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 52, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 52, SpringLayout.EAST, resetButton);
		
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -58, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -204, SpringLayout.EAST, this);
		this.chatField = new JTextField("Talk to the bot here.", 50);
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, 39, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 39, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 39, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 39, SpringLayout.SOUTH, chatField);
		this.chatArea = new JTextArea("Chat Area", 20, 50); 
		this.chatPane = new JScrollPane();
		this.checkerButton = new JButton("Check Text");
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, -651, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 52, SpringLayout.EAST, checkerButton);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 39, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 52, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, -58, SpringLayout.SOUTH, this);
		
		
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
		this.add(resetButton);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent click)
				{
					String input = chatField.getText(); 
					String output = "";
					output = chatController.interactWithChatbot(input); 
					chatArea.append(output); //append is add to the end
					chatField.setText(""); 
					chatArea.setCaretPosition(chatArea.getDocument().getLength());
				}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent click)
				{
					String chatText = chatArea.getText(); 
					String path = getPath("save");
					IOController.saveText(chatController, path, chatText); 
					chatArea.setText("Chat saved!");
				}
		});
		
		loadButton.addActionListener(new ActionListener()
		{	
				public void actionPerformed(ActionEvent click)
				{
					String path = getPath("load");
					String chatText = IOController.loadFile(chatController, path);
					chatArea.setText(chatText);
				}
		});
		
		checkerButton.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent click)
				{
					
				}
		});
		
		resetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				chatArea.setText("Hello. :)");
			}
		});
		
	}
	
	private String getPath(String choice)
	{
		String path = ".";
		int result = -99; 
		JFileChooser fileChooser = new JFileChooser(); 
		if (choice.equals("save")) 
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
			result = fileChooser.showSaveDialog(this); 
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}
		}
		else
		{
			result = fileChooser.showOpenDialog(this); 
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getSelectedFile().getAbsolutePath(); 
			}
		}
		
		return path;
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		
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
