import java.io.*;

public class WriteFile
{
	public static void main(String []args)
	{
		try{ //location must be the path where the file is saved
		
			FileWriter file = new FileWriter("C:\\Users\\JM\\OneDrive - American International University-Bangladesh\\Desktop\\Files\\text.doc");   // write in the file according to where it is located
			file.write("This is a new file.\nSomething is being written....");
			  
			System.out.println("Written in the new file successfully");
			//System.out.println(getName());
			file.close();     //closed the file and all sorts of action io with the file is termininated
			//System.out.println("The file size is: "+file.length()+"Bytes"); 
		}

		catch(IOException io)
		{
			System.out.println("An error has just occured! :(");
			io.printStackTrace();
		}
	}
}