import java.util.Scanner;
//NAVPREET KAUR REG.NO:748674

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
			
		while (choice != 4) {
			// 1. show the menu
			showMenu();
			
			
			
			
	
			// 2. get the user input
			System.out.println("Enter a number: ");
			choice = keyboard.nextInt();
			
			// 3. DEBUG: Output what the user typed in 
			System.out.println("You entered: " + choice);
			
			System.out.println("");
			if (choice==1)
			{
				System.out.println("1. Triangle");
				TwoDimensionalShape Tr1=new Triangle(2, 3, "black");
				Tr1.calculateArea();
				TwoDimensionalShape Trp=new Triangle(2, 3, "black");
				Tr1.printInfo();
				
			}
			else if(choice==2)
			{
				
				System.out.println("2. Square");
				TwoDimensionalShape Sqr=new Square(3, "Blue");
				Sqr.calculateArea();
				TwoDimensionalShape Sqrp=new Square(3, "Blue");
				Sqrp.printInfo();
			}
			 
			else
				{
				System.out.println("Exit");
		}
		
		}
	}
	
	
	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		
		

}}
