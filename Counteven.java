//wap to print count of even numbers...


import java.util.Scanner;
class Counteven {
			public static void main(String[] args){
				Scanner scn = new Scanner(System.in);
				System.out.println("enter start value");
				int start = scn.nextInt();
				System.out.println("enter end value");
				int end = scn.nextInt();
				    
					int sum = 0; 
					int count = 0;
					for(int i=start; i<=end; i++){
						if(i%2== 0){
							count++;
					} 
						sum = sum + i;
			}
						
}

}

















