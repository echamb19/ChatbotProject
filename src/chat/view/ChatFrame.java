package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController chatController; 
	private ChatPanel chatPanel; 
	
	public ChatFrame(ChatController chatControlelr)
	{
		super();
		
		this.chatController = chatController; 
		this.chatPanel = new ChatPanel(chatController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(chatPanel);
		this.setTitle("Chatbot GUI"); 
		this.setSize(800, 600);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
