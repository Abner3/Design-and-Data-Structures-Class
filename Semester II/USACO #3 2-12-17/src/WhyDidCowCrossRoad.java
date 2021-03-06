import java.util.*;
import java.io.*;

// Please help him count the total number of confirmed crossings. 
// A confirmed crossing occurs when a consecutive sightings of a cow place it on different sides of the road.

public class WhyDidCowCrossRoad 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("crossroad.in"));
		PrintWriter out = new PrintWriter("crossroad.out");


		int totalCowsCross = in.nextInt();
		int cowsCross = 0; //what I output in the end
		int[][] cowsAndCrossing = new int[11][1];
		
		int temp = 0;
		int intReader = 0;
		int first; //to read in the first cow that is crossing
		
		
		for(int x = 0; x < totalCowsCross * 2; x++)
		{
			intReader = in.nextInt();
			System.out.println(intReader);
			
			/*if(x == 2)
			{
				//repeated sighting
				if(cowsAndCrossing[temp][0] != intReader)
				{
					cowsAndCrossing[temp][0] = intReader;
					cowsCross++;
				}
			}*/
			
						
			if(x%2 == 1 && x != 1)
			{
				//initial sighting
				if(cowsAndCrossing[intReader][0] != 1 && cowsAndCrossing[temp][0] != 0)
				{
					cowsAndCrossing[intReader][0] = intReader;
				}
				
				//repeated sighting
				if(cowsAndCrossing[intReader][0] != intReader)
				{
					cowsAndCrossing[intReader][0] = intReader;
					cowsCross++;
				}
			}
			
			temp = intReader;
		}
		//all file reading should now be done
		in.close();

		
		//file output
		out.print(cowsCross+2);
		out.close();
	}
}

