package Com.w.pof;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReader 
{

	public static void main(String[] args) throws IOException
	{
		 String fpath="D:\\wishes.txt";
	
		FileReader fr=new FileReader(fpath);
		BufferedReader br=new BufferedReader(fr);

		String words=br.readLine();
		if(words!=null)
		{
			System.out.println(words);
			words= br.readLine();

		}
		fr.close(); 
	}
}


