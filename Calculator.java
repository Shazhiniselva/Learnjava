//wap to deveplop claculator

import java.util.Scanner;
class Calculator {
		public static void main(String[] args){
			Scanner scn =  new Scanner(System.in);
			System.out.println("enter num1 value");
			int num1 = scn.nextInt();
			System.out.println("enter num2 value");
			int num2 = scn.nextInt();
			System.out.println("1.add\n 2.sub\n 3.mul\n 4.divide\n 5.Mod");
			System.out.println("enter ur choice!");
			int choice = scn.nextInt();
			Switch(choice){
					ase 1:
						System.out.println("result = "+(num1 + num2));
						break;
					Case 2:
						System.out.println("result = "+(num1 - num2));
						break;
					case 3:
						System.out.println("result = "+(num1 * num2));
						 break;
					case 4:
						System.out.println("result = "+(num1 / num2));
						break;
					case 5:
						System.out.println("result = "+(num1 % num2));
						break;

					default: System.out.println("Invalid choice");
}

}

}

















