import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args)
	{
		int number1;
		int number2;
		String answer;
		
		Scanner s1 = new Scanner(System.in);
		
		do {
			System.out.println("What do you wish to do?");
			System.out.println("1. Addition +");
			System.out.println("2. Subtraction -");
			System.out.println("3. Multiplication *");
			System.out.println("4. Division /");
			System.out.println("5. Modulo %");
			System.out.println("My choice: ");
			int ch = s1.nextInt();
					
			switch(ch) {
			case 1:
						System.out.println("Enter first number: ");
						number1 = s1.nextInt();
						
						System.out.println("Enter second number: ");
						number2 = s1.nextInt();

						int addition = number1 + number2;
						
						System.out.println("Result is: " + addition);
						
					break;
					
			case 2:
						System.out.println("Enter first number: ");
						number1 = s1.nextInt();

						System.out.println("Enter second number: ");
						number2 = s1.nextInt();

						int subtraction = number1 - number2;
						
						System.out.println("Result is: " + subtraction);
						
					break;
					
			case 3:
						System.out.println("Enter first number: ");
						number1 = s1.nextInt();
						
						System.out.println("Enter second number:");
						number2 = s1.nextInt();
						
						int multiplication = number1 * number2;
						
						System.out.println("Result is: " + multiplication);
						
					break;
					
			case 4: 
						System.out.println("Enter first number: ");
						number1 = s1.nextInt();
						
						System.out.println("Enter second number: ");
						number2 = s1.nextInt();
						
						int division = number1 / number2;
						
						System.out.println("Result is: " + division);
						
					break;
						
			case 5:
						System.out.println("Enter first number: ");
						number1 = s1.nextInt();
						
						System.out.println("Enter second number: ");
						number2 = s1.nextInt();
						
						int modulo = number1 % number2;
						
						System.out.println("Result is: " + modulo);
						
					break;
					
					
				default: 
						
						System.out.println("Enter a valid option (1 or 2)");
						
			}
			
			System.out.println("Do you want to continue? (y/n): ");
			answer = s1.next();
			
			
		}while(answer.equalsIgnoreCase("y"));
		}
}

