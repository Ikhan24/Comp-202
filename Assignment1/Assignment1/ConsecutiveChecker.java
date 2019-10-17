//Intesarul Khan

//McGill ID- 260579991

import java.util.Scanner;

public class ConsecutiveChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Consecutive Digit Checker");
    System.out.print("Enter a 4 Digit or less positive digit");
    int digit = input.nextInt();
    int lastdigit = digit % 10;
    int i = digit / 10;
    int thirddigit = i % 10;
    int s = digit/ 100;
    int seconddigit = s % 10;
    int firstdigit = i / 100;
    
    
    boolean ConsecutiveDigit;
    ConsecutiveDigit =       (seconddigit==firstdigit-1 &&thirddigit==seconddigit-1&&lastdigit==thirddigit-1) ||
      (lastdigit==thirddigit-1&&seconddigit==0&&firstdigit==0) ||
                 (lastdigit==thirddigit-1&&thirddigit==seconddigit-1&&firstdigit==0) ||
      (seconddigit==firstdigit+1&&thirddigit==seconddigit+1&&lastdigit==thirddigit+1) || 
      (lastdigit==thirddigit+1&&firstdigit==0&&seconddigit==0) ||
      (lastdigit==thirddigit+1&&thirddigit==seconddigit+1&&firstdigit==0);
               System.out.print("Is the digit Consecutive? "); 
    System.out.println(ConsecutiveDigit);
                       
  }
} 
