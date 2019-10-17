import java.util.Arrays;

public class SearchComparison {
 
 public static void main(String[] args) 
  { for(int n = 10; n<5000000 ; n=n*2) 
   {  StopWatch see= new StopWatch();
    
     System.out.print(n+ ","+ "");
   
     see.start();
     ArrayUtilities.generateRandom(n);
     see.stop();
     int [] x= ArrayUtilities.generateRandom(n);
     System.out.print(see.getTimeMicro()+","+"");
   
     
     
     see.start();
     ArrayUtilities.linearSearch(x,-1);
     see.stop(); 
     System.out.print(see.getTimeMicro()+","+"");
   
     
     see.start();
     int [] y=ArrayUtilities.copy(x);
     see.stop();
     System.out.print(see.getTimeMicro()+","+"");
     
     
     if (n<500000){
     see.start();
     ArrayUtilities.sort(x);
     see.stop(); 
     System.out.print(see.getTimeMicro()+","+""); }
     else if (n>500000){
      System.out.print("0"+ ","+ "");
     }
  
    
     see.start();
     Arrays.sort(y);
     see.stop();
     System.out.print(see.getTimeMicro()+","+"");
     
     
     see.start();
     ArrayUtilities.binarySearch(y,-1);
     see.stop();
     System.out.println(see.getTimeMicro()+","+"");
    
     }
  }
 
 

    
  

}