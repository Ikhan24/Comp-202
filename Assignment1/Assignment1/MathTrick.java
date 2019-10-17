//Intesarul Khan


//McGill ID- 260579991

import java.util.Scanner;

public class MathTrick{
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("I, Intu predict, answer will be 1089 !" );
    System.out.println("Enter a three digit variable in which all digits are decreasing. ");
              int digit = input.nextInt();
   int fourthdigit = digit % 10;
   int C = digit / 10;
   int seconddigit = C % 10;
   int firstdigit = C / 10;
      int finaldigit = fourthdigit*100 +seconddigit*10 +firstdigit;
   System.out.print("Your digit reversed is ");
   System.out.println(finaldigit);
     int difference = digit - finaldigit; 
   System.out.print("The difference is ");
   System.out.println(difference);
     int difourthdigit = difference % 10;
   int R = difference / 10;
   int diseconddigit = R % 10;
   int difirstdigit = R / 10;
   int difinaldigit  = difourthdigit*100 +diseconddigit*10 +difirstdigit;
   System.out.print("The difference reversed is ");
   System.out.println(difinaldigit);
   System.out.print("The total sum is ");
   System.out.println(difinaldigit+difference);
   
 }
}
