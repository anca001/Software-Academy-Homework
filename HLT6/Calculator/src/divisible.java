import java.util.Scanner;

public class divisible {
	
		
	static void result(int N)
	{

		for(int num = 0; num < N; num++) 
		{
			if(num % 3 == 0 && num % 5 == 0) 
			{
				System.out.print(num + " ");
			}
		}
		System.out.println("");
	}
	
	
	public static void main(String [] args)
	{
			String answer;
			System.out.println("This program prints all the numbers divisible by 3 and 5 for a given number.");
			do {
			System.out.println("Please enter a number: ");
			Scanner s1 = new Scanner(System.in);

			int N = s1.nextInt();
			
		    result(N);
		    
			System.out.println("Do you wish to repeat? (y/n): ");
			answer = s1.next();
			} while(answer.equalsIgnoreCase("y"));
			
			System.out.println("Thank you for playing!");
		
				
	}
	
	//System.out.println("Do you wish to repeat? (y/n): ");
	//answer = s1.next();
	
//how do I make this loop? I couldn't do it with do-while because I was getting the following error: 
//Cannot make a static reference to the non-static field answer
	
	}
