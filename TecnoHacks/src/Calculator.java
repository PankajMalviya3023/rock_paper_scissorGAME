import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Welcome to The simple Arithmetic Calculator");
		System.out.println("What would you Like to do ?");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multipilication");
		System.out.println("4.Division");
		
		int op=sc.nextInt();
		
		if(op<5 && op>0) {
		System.out.println("Enter the Numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		switch(op) {
		case 1 :
			System.out.println("The sum is "+ (a+b));
			break;
		
	
		case 2 :
			System.out.println("The substraction is " + (a-b));
			break;
		
		
	    case 3 :
	    	System.out.println("The Multiply is "+ (a*b));
	    	break;
	
	    
        case 4 :
        	System.out.println("The division is "+ (a/b));
        	break;

        
		default :
			
			
		}
		
		}
		else {
			System.out.println("Invalid choice");
		}
		
		System.out.println("Would you like to do another operation (Y/N)");
		String ans = sc.next();
		if(ans.equalsIgnoreCase("Y")) {
			main(args);
		}
		else {
			System.out.println("ThankU for using the Calculator !");
		}

	}
		
	}

}

