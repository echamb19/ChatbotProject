package chat.controller;

import java.util.Calendar; 
import java.util.Scanner; 
import java.io.IOException; 
import java.io.File; 
import java.io.PrintWriter; //How to write things to the file [Works like systemOut.println]

public class IOController
{
	public static void saveText(ChatController app, String path, String textToSave)
	{
		try
		{
			String filename = path; 
			Calendar date = Calendar.getInstance(); 
			filename += "/" + date.get(Calendar.MONTH) + " " + date.get(Calendar.DAY_OF_MONTH); //Gets the month and day From the Calendar
			filename += date.get(Calendar.HOUR) + "-" + date.get(Calendar.MINUTE); //Gets the Hour and Minute from the Calendar
			filename += " chatbot save.txt"; 
			
			File saveFile = new File(filename); 
			Scanner textScanner = new Scanner(textToSave); 
			PrintWriter saveText = new PrintWriter(saveFile); 
			
			while(textScanner.hasNext()) // V This while loop goes through all lines until there are no more lines. 
			{
				String currentLine = textScanner.nextLine(); 
				saveText.println(currentLine); 
			}
			
			textScanner.close(); //Must close because bad things if you don't.
			saveText.close(); //You could lose data. 
		}
		catch(IOException error)
		{
			app.handleErrors(error); 
		}
		catch(Exception genericError)
		{
			app.handleErrors(genericError); 
		}
	}
	
	public static String loadFile(ChatController app, String path)
	{
		String contents = ""; 
		
		try
		{
			File saveFile = new File(path); 
			Scanner fileScanner; 
			if(saveFile.exists())
			{
				fileScanner = new Scanner(saveFile);
				while(fileScanner.hasNext())
				{
					contents += fileScanner.nextLine() + "\n";
				}
			}
		}
		catch(IOException error)
		{
			app.handleErrors(error); 
		}
		catch(Exception genericError)
		{
			app.handleErrors(genericError);
		}
		return contents;
	}
}
