//Intesarul Khan

//McGill ID- 260579991

public class CellComparison{
                 public static void main(String[] args) { 
    java.util.Scanner keyboardReader = new java.util.Scanner(System.in);
      System.out.println("Cell Phone Plan");
      System.out.println("How many minutes will you talk per month ?" );
    int min = keyboardReader.nextInt();
      System.out.println("How many months will you use this phone ?");
     int month = keyboardReader.nextInt(); 
        double PlanFirst = 50*month + 0.1*min*month;
    System.out.print("Under the first plan, you will pay $"); 
    System.out.println(PlanFirst); 
     double PlanSecond = 500 + 25*month + 0.05*min*month;
    System.out.print("Under the second plan, you will pay $"); 
    System.out.println(PlanSecond); 
  
  } 
} 
      
 