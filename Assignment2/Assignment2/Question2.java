//Intesarul Qayyum Khan
//McGill ID:260579991
public class Question2 {
 
  public static void main(String [] args) {
  
    int a = 14;
    int b = 8;
    int radius = 5; 
    DrawMeACircle (a, b, radius);
    
  }

public static void DrawMeACircle (int posX,int posY,int radius) {
                    
  for(int i = 0; i<20;i++)
  {
    for(int j = 0; j<20 ; j++) { 
        
   int circleloop  = ((i-posX)*(i-posX) + (j-posY)*(j-posY));
 
   int otherloop = (circleloop - radius*radius);
     
   int constant = radius-1; 
   if (otherloop >=0 && otherloop<= (constant) )
   {
     
     System.out.print("#");
     
   }
   
   else
   
     System.out.print(" ");
       
   }
 System.out.print("\n"); 

  }
}
}
