import java.io.*;
public class Createfile
{public static void main(String []args)
	{
		try{// location of the file to be created 
		File n=new File("C:\\Users\\JM\\OneDrive - American International University-Bangladesh\\Desktop\\Files\\text.doc");

		if(n.createNewFile())
		{
			System.out.println("A new file is successfully created!!"+ n.getName());
		}
		else
		{
			System.out.println("The file can not be created or already exists");
		}

		if(n.exists() == true)
		{
			System.out.println("The file exists!!");
		}

		else
		{
			System.out.println("Could not found or does not exist");
		}
		
		

		//newfile.close();


        }
		catch(IOException io)
		{
			System.out.println("An error Occured and failed to create the file");
			io.printStackTrace();
		}
	}
}
