import java.util.Scanner;

public class Calculator{
	Scanner sc = new Scanner(System.in);
	private int num1,num2;


	public static void main( String[] args){
		Scanner sc = new Scanner(System.in);
		boolean loop = true;


	//instanciate class
		Calculator calc = new Calculator();
		int meunChoice;
	do{
			//prompt first number 
		calc.getNum1();
	//prompt second number 
		calc.getNum2();
	//display menu
		calc.printMenu();
	//prompt for arithmetic function
		System.out.print("Enter your choice:");
	//print result
		meunChoice = sc.nextInt();
		calc.result(meunChoice);
		}while(meunChoice != 6);
	
	}

	public void getNum1(){
		System.out.print("\nEnter first number: ");
		this.num1 = sc.nextInt();
	}

	public void getNum2(){
		System.out.print("Enter second number: ");
		this.num2 = sc.nextInt();
	}

	public void printMenu(){
		System.out.print("1.Addition \n2.Subtraction\n3.Multiplication\n4.Divide\n5.Remainder\n6.Exit\n");
	}

	public void result(int num){

		if (num ==1 ) {
			System.out.print("Result is: "+(this.num1+this.num2));
		}else if ( num ==2) {
			System.out.print("Result is: "+(this.num1-this.num2));
		}else if ( num ==3) {
			System.out.print("Result is: "+(this.num1*this.num2));
		}else if ( num ==4) {
			System.out.print("Result is: "+(this.num1/this.num2));
		}else if ( num ==5) {
			System.out.print("Result is: "+(this.num1%this.num2));
		}else if ( num ==6) {
			
		}
	}



}

