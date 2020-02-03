package Com.w.pof;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class filewriter
{
	public static void main(String[] args) throws Exception
	{
		String filepath="D:\\wishes.txt";
		FileOutputStream fos=null;

		try 
		{
			fos= new FileOutputStream(filepath);

			Scanner sc =new Scanner(System.in);
			System.out.println("enter your data to store");
			String str=sc.nextLine();	
			char ch=0;
			for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i);
				fos.write(ch);
			}
			System.out.println("your enter data store in database");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

	}
}

