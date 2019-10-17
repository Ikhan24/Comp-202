public class StopWatch 
{
private long startTime;
private long stopTime;

public static void main(String[]args)
{
  StopWatch watch = new StopWatch();
  watch.start();

  for (int i = 0; i < 100; i++)
  {
    System.out.println("I'm going to test how fast it is to print this 100 times");
  }
  
  watch.stop();
  System.out.println("It took " + watch.getTimeNano() + " nanoseconds to complete the task");
  System.out.println("It took " + watch.getTimeMicro() + " microseconds to complete the task");
  System.out.println("It took " + watch.getTimeMilli() + " milliseconds to complete the task");
  System.out.println("It took " + watch.getTimeSeconds() + " seconds to complete the task");
}

//1
public long start()
{
  startTime = System.nanoTime();
  return startTime;
}

//2
public long stop()
{
  stopTime = System.nanoTime();
  return stopTime;
}

//3
public long getTimeNano()
{
  return (stopTime - startTime);
}

//4
public long getTimeMicro()
{
  return ((stopTime - startTime)/1000);
}

//5
public long getTimeMilli()
{
  return ((stopTime - startTime)/1000000);
}

//6
public long getTimeSeconds()
{
  return ((stopTime - startTime)/1000000000);
}
}
