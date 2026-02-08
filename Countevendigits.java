//wap to count evendigits..

import java.util.Scanner;
class Countevendigits {                                                                  
    public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:");     
        int num = scn.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {         
            int digit = temp % 10;
                   count++;
            }         

            temp = temp / 10;
        }                                       

}   




