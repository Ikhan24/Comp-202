package assignment4;

import java.util.Random;
public class DiscussionDirector {
	public static void discuss(Agent A, Agent B){
		//creating a random number generator
		Random initiator=new Random();
		//A shall start by saying hello
		A.sayHello();
		//how the random generation works is it generate a number between 0 to 9, and use that to model percent chance.
		int choice=initiator.nextInt(10);
		if(choice<5){
			System.out.println(B.getName()+" says: Hello " + A.getName()+" I am "+B.getName()+ " and I'm not feeling so good.");
			choice=initiator.nextInt(10);
			if(choice<8){
				System.out.println(A.getName()+" says: Why are you not feeling so good?");
				System.out.println(B.getName()+" says: I just left my hometown "+ B.getCityBorn()+ ".");
				System.out.println(A.getName()+" says: Well, me too. I was from "+ A.getCityBorn()+" and now I'm in "+A.getCityNow()+".");
				choice=initiator.nextInt(10);
				if(choice<3){
					System.out.println(B.getName()+" says: Sorry I can not speak with people from "+A.getCityNow()+".");
				}
				else{
					Agent.sayFascinating(B);
				}
			}
			else{
				System.out.println(A.getName()+" says: Well "+ B.getName()+" I don't care because I'm from "+A.getCityBorn()+".");
				choice=initiator.nextInt(10);
				if(choice<1){
					System.out.println(B.getName()+" says: Well I'm sorry I'm Canadian.");
				}
				else{
					System.out.println(B.getName()+" says: No one in my major "+B.getMajor()+" is this rude.");
				}
				System.out.println(A.getName()+" says: Sorry I have to go.");
			}
		}
		else{
			//condensed the dialogue about an agent hating on the other's city.....
			Agent.cityConflict(A,B);
			choice=initiator.nextInt(10);
			if(choice<3){
				Agent.sayFascinating(B);
			}
			else{
				//this is long and linear so I made it into a method in Agent.java
				Agent.iLoveYourGrooveEnding(A,B);
			}
		}
		//tells the user if a parts of the .txt files are missing by making additional print statements
		if(A.getName()=="Akiyuki Shinbo"||A.getName()=="Kaname Madoka"){
			System.out.println("Note, one or both name files are missing!");
		}
		if(A.getCityBorn()=="Tokyo"){
			System.out.println("Note, Cities.txt is missing!");
		}
		if(A.getMajor()=="Japanese animation studies"){
			System.out.println("Note, Majors.txt is missing!");
		}
	}
	public static void discuss2(Agent A,Agent B){
		
	}
}
