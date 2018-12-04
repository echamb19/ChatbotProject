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
		this.setSize(1000, 1000);
		this.setResizable(true);
		this.setVisible(true);
	}
	
}
