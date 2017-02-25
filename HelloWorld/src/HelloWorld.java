import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		//Scanner one = new Scanner(System.in);
        System.out.print("Enter value:" );  
        a = input.nextDouble();
        //System.out.println("Enter value:" + a);
		
        
        //Scanner two = new Scanner(System.in);
        System.out.print("Enter value:");  
        b = input.nextDouble();
        //System.out.println("Enter value:" + b);
        
        //Scanner three = new Scanner(System.in);
        System.out.print("Enter value:");  
        c = input.nextDouble();
        //System.out.println("Enter value:" + c);
        
        if (c < a || c > b)
        {
        	System.out.println("Invalid value!" ); 
        }
        else
        {
        	System.out.println("Value " + c + " is between " + a + " and " + b ); 
        }
        
    
		
		
	}

}
