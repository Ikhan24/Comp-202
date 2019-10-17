package assignment4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;

public class WordList 
{
	private ArrayList<String> words=null;
	public static Random r =new Random();
	
	public WordList(String filename)
	throws IOException
	{
		BufferedReader br =new BufferedReader(new FileReader(filename));
		String line = br.readLine();
		words=new ArrayList<String>();
		
		while (line != null) 
        {
			words.add(line);
            line = br.readLine();
        }
		
        br.close();
	}
	public String getRandom()
	{
		
		String random = words.get(r.nextInt(words.size()));
		return random;
	}
}


	

