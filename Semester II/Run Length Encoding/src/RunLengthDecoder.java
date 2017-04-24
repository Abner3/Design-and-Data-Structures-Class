import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RunLengthDecoder
{
	public static void main(String[] args) throws IOException 
	{
		char currentChar, nextChar;
		int totalNumber;


		BufferedReader br = new BufferedReader(new FileReader("RLEmystery.txt"));


		FileWriter fw = new FileWriter("outputDecoder.txt");

		while(br.ready())
		{
			currentChar = (char) br.read();
			nextChar = (char) br.read();	
			totalNumber = 1;


			if(currentChar == nextChar)
			{
				totalNumber = br.read();
			}
			
			
			for(int counter = 0; counter < totalNumber; counter++)
			{
				fw.write(currentChar);
			}
		}

		br.close();
		fw.close();
	}
}

