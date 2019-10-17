//Intesarul Qayyum Khan
//McGill ID:260579991
public class Question3 {
 
  public static void main(String [] args) {
  
    int a = 10;
    int b = 8;
    int radiusA = 5;
    int radiusB = 1;
    DrawMeAnEllipse (a, b, radiusA, radiusB);
    
  }

public static void DrawMeAnEllipse (int posX,int posY,int radiusA,int radiusB)  {
                    
  for(int j = 0; j<20;j++)
  {
    for(int i = 0; i<20 ; i++) { 
        
   int circleloop  = ( (((i-posX)*(i-posX))/((radiusA)*(radiusA))) + ((j-posY)*(j-posY))/((radiusB)*(radiusB)));
 
   int otherloop = (circleloop - 1);
     
   if (otherloop ==0 )
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
