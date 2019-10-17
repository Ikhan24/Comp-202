//Intesarul Qayyum Khan
//McGill ID:260579991
import java.util.*;
public class Question1
{
 public static void main(String [] args) 
   {
    
     Scanner input = new Scanner(System.in);
     String consecutive = input.next();
     
     System.out.print(IsConsecutive(consecutive.toUpperCase() )); 
   }
     
   public static boolean IsConsecutive (String s) 
   {      
     
     
     int A = s.length();
     
     String[] array = new String[A];
     
     for (int i = 1; i <= array.length - 1; i++)
     {
       if ( s.charAt(i) - s.charAt(i-1) == 1 
             || ( s.charAt(i) == 65 && s.charAt(i-1) == 90)
             || ( s.charAt(i) == 48 && s.charAt(i-1) == 57) )
       {
         
       }
       else if ( s.charAt(i-1) - s.charAt(i) == 1
               || ( s.charAt(i-1) == 65 && s.charAt(i) == 90)
               || ( s.charAt(i-1) == 48 && s.charAt(i) == 57) )
       {
       }
       else 
       {
         return false;       
       }
     }
     return true;
            
   }
 }