import java.io.*;
import java.util.*;

public class Tester 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("frequencyCountInput.txt"));
		PrintWriter pw = new PrintWriter("HuffmanOutput");
		
		
		HuffmanEncoding huffman = new HuffmanEncoding(br);
		System.out.println(huffman.toString());
		
		
		pw.close();
		br.close();
	}
}