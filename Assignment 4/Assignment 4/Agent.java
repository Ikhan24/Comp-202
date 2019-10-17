package assignment4;

import java.io.IOException;
import java.util.Calendar;
import java.util.Random;


public class Agent {
	//creating variables
	private boolean gender;
	private int birthYear;
	private String birthday;
	private String name;
	private String cityBorn;
	private String cityNow;
	private String major;
	//all the get methods
	public String getCityNow(){
		return this.cityNow;
	}
	public String getCityBorn(){
		return this.cityBorn;
	}
	public String getName(){
		return this.name;
	}
	public String getGender(){
		if(this.gender){
			return "female";
		}
		else{
			return "male";
		}
	}
	public String getMajor(){
		return this.major;
	}
	public String getBirthday(){
		return this.birthday;
	}
	//all the "say" methods
	public void sayHello(){
		System.out.println(this.getName()+ " says: Hi, what's up?");
	}
	public void sayCityBorn(){
		System.out.println(this.getName()+ " says: I am born in " + this.getCityBorn() + ".");
	}
	public void howOldAreYou(){
		int currentYear=Calendar.getInstance().get(Calendar.YEAR);
		int age=currentYear-this.birthYear;
		System.out.println(this.getName()+ " says: I am " + age + "years old.");
	}
	public void sayGender(){
		System.out.println(this.getName()+ " says: I am " + this.getGender() + ".");
	}
	public void sayCityNow(){
		System.out.println(this.getName()+ " says: I am currently in " + this.getCityNow() + ".");
	}
	public void sayMajor(){
		System.out.println(this.getName()+ " says: I have a degree in " + this.getMajor() + ".");
	}
	//creates an agent
	public static Agent generateAgent(){
		Agent ret=new Agent();
		//initiallizing everything to be null because eclipse likes it that way
		String maleName=null;
		String femaleName=null;
		String cityBorn=null;
		String cityNow=null;
		String major=null;
		WordList maleNameList=null;
		WordList femaleNameList = null;
		WordList cityList = null;
		WordList majorList = null;
		//creating a random generator
		Random initiator= new Random();
		//giving hard-coded values if files do not exist
		try{
			maleNameList=new WordList("MaleNames.txt");
		}
		catch (IOException e) {
			maleName="Akiyuki Shinbo";
		}
		try{
			femaleNameList=new WordList("FemaleNames.txt");
		}
		catch (IOException e) {
			femaleName="Kaname Madoka";
		}
		try{
			cityList= new WordList("Cities.txt");
		}
		catch (IOException e) {
			cityBorn="Tokyo";
			cityNow="Mitakihara";
		}
		try{
			majorList= new WordList("Majors.txt");
		}
		catch (IOException e) {
			major="Japanese animation studies";
		}
		//generating the gender and birthday values randomly
		ret.gender=initiator.nextBoolean();
		int year=initiator.nextInt(100) + 1900;
		int month=initiator.nextInt(12) + 1;
		int day=initiator.nextInt(30)+1;
		String birthday=Integer.toString(year)+"/"+Integer.toString(month)+"/"+Integer.toString(day);
		ret.birthday=birthday;
		ret.birthYear=year;
		String agentName;
		//error handling: if the files did not exist, don't assign the name, city, or major randomly.
		try{
		femaleName=femaleNameList.getRandom();
		}
		catch(NullPointerException e){
			
		}
		try{
		maleName=maleNameList.getRandom();
		}
		catch(NullPointerException e){
			
		}
		try{
		major=majorList.getRandom();
		}
		catch(NullPointerException e){
			
		}
		try{
		cityBorn=cityList.getRandom();
		cityNow=cityList.getRandom();
		}
		catch(NullPointerException e){
			
		}
		//assigning all the values to the created agent accordingly
		if(ret.gender) agentName=femaleName;
		else agentName=maleName;
		ret.major=major;
		ret.name=agentName;
		ret.cityBorn=cityBorn;
		ret.cityNow=cityNow;
		return ret;
	}
	//prints the biography
	public void whoAreYou(){
		this.sayHello();
		this.howOldAreYou();
		this.sayCityBorn();
		this.sayCityNow();
		this.sayGender();
		this.sayMajor();
		//prints the birthday for fun
		System.out.println("my birthday is "+ this.getBirthday());
	}
	public static void sayHelloTo(Agent A, Agent B){
		System.out.println(A.getName()+" says: Hi "+B.getName()+", my name is "+A.getName()+".");
	}
	public static void iLoveYourGrooveEnding(Agent A,Agent B){
		System.out.println(B.getName()+" says: I love your groove.");
		System.out.println(A.getName()+" says: Well, thank you but I don't know your name.");
		sayHelloTo(B,A);
		System.out.println(A.getName()+" says: Sorry "+B.getName()+ ", I gotta go.");
	}
	public static void cityConflict(Agent A,Agent B){
		System.out.println(B.getName()+" says: How are you "+A.getName()+ "?");
		System.out.println(A.getName()+" says: Fine, where are you from?");
		System.out.println(B.getName()+" says: I am from "+B.getCityNow()+".");
		System.out.println(A.getName()+" says: I don't like people from "+ B.getCityNow()+" because I am from "+ A.getCityNow()+".");
	}
	public static void sayFascinating(Agent A){
		System.out.println(A.getName()+" says: That's fascinating!");
	}
	//main method to test the code
	public static void main(String[]args){ 
		Agent test=generateAgent();
		test.whoAreYou();
		Agent A=generateAgent();
		Agent B=generateAgent();
		DiscussionDirector.discuss(A,B);
	}
	
}
