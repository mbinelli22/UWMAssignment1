package HW1;

import java.util.Scanner;

public class SpeechFormatter {

	//Abraham Lincoln's Gettysburg Address
	static final String lincolnGettysburg = "Fourscore and seven years ago our fathers brought forth,"
			+ " on this continent, a new nation, conceived in liberty, and dedicated"
			+ " to the proposition that all men are created equal. Now we are engaged"
			+ " in a great civil war, testing whether that nation, or any nation so"
			+ " conceived, and so dedicated, can long endure. We are met on a great"
			+ " battle-field of that war. We have come to dedicate a portion of that"
			+ " field, as a final resting-place for those who here gave their lives,"
			+ " that that nation might live. It is altogether fitting and proper that"
			+ " we should do this. But, in a larger sense, we cannot dedicate, we"
			+ " cannot consecrate—we cannot hallow—this ground. The brave men, living"
			+ " and dead, who struggled here, have consecrated it far above our poor"
			+ " power to add or detract. The world will little note, nor long remember"
			+ " what we say here, but it can never forget what they did here. It is"
			+ " for us the living, rather, to be dedicated here to the unfinished work"
			+ " which they who fought here have thus far so nobly advanced. It is rather"
			+ " for us to be here dedicated to the great task remaining before us—that"
			+ " from these honored dead we take increased devotion to that cause for"
			+ " which they here gave the last full measure of devotion—that we here"
			+ " highly resolve that these dead shall not have died in vain—that this"
			+ " nation, under God, shall have a new birth of freedom, and that government"
			+ " of the people, by the people, for the people, shall not perish from the earth."
			+ " ---Abraham Lincoln";

	//George Washington's retirement speech
	static final String washingtonRetirement = "The great events on which my resignation"
			+ " depended having at length taken place; I have now the honor of offering"
			+ " my sincere Congratulations to Congress and of presenting myself before"
			+ " them to surrender into their hands the trust committed to me, and to claim"
			+ " the indulgence of retiring from the Service of my Country.  Happy in the"
			+ " confirmation of our Independence and Sovereignty, and pleased with the"
			+ " opportunity afforded the United States of becoming a respectable Nation,"
			+ " I resign with satisfaction the Appointment I accepted with diffidence. A"
			+ " diffidence in my abilities to accomplish so arduous a task, which however"
			+ " was superseded by a confidence in the rectitude of our Cause, the support"
			+ " of the Supreme Power of the Union, and the patronage of Heaven."
			+ " The Successful termination of the War has verified the most sanguine"
			+ " expectations, and my gratitude for the interposition of Providence, and"
			+ " the assistance I have received from my Country-men, encreases with every"
			+ " review of the momentous Contest.  While I repeat my obligations to the"
			+ " Army in general, I should do injustice to my own feelings not to acknowledge"
			+ " in this place the peculiar Services and distinguished merits of the Gentlemen"
			+ " who have been attached to my person during the War. It was impossible"
			+ " the choice of confidential Officers to compose my family should have"
			+ " been more fortunate. Permit me Sir, to recommend in particular those,"
			+ " who have continued in Service to the present moment, as worthy of the"
			+ " favorable notice and patronage of Congress I consider it an indispensable"
			+ " duty to close this last solemn act of my Official life, by commending the"
			+ " Interests of our dearest Country to the protection of Almighty God, and"
			+ " those who have the superintendence of them, to his holy keeping.  Having"
			+ " now finished the work assigned me, I retire from the great theatre of"
			+ " Action; and bidding an Affectionate farewell to this August body under"
			+ " whose orders I have so long acted, I here offer my Commission, and take"
			+ " my leave of all the employments of public life. ---George Washington";

	//Lou Gehrig baseball speech
	static final String louLuckiestManAlive = "Fans, for the past two weeks you have been reading"
			+ " about the bad break I got. Yet today I consider myself the luckiest man on"
			+ " the face of this earth. I have been in ballparks for 17 years and have"
			+ " never received anything but kindness and encouragement from you fans."
			+ " Look at these grand men. Which of you wouldn’t consider it the highlight"
			+ " of his career just to associate with them for even one day? Sure, I’m lucky."
			+ " Who wouldn’t consider it an honor to have known Jacob Ruppert? Also,"
			+ " the builder of baseball’s greatest empire, Ed Barrow? To have spent six"
			+ " years with that wonderful little fellow, Miller Huggins? Then to have spent"
			+ " the next nine years with that outstanding leader, that smart student of"
			+ " psychology, the best manager in baseball today, Joe McCarthy? Sure, I’m lucky."
			+ " When the New York Giants, a team you would give your right arm to beat, and"
			+ " vice versa, sends you a gift — that’s something. When everybody down to the"
			+ " groundskeepers and those boys in white coats remember you with trophies - that’s"
			+ " something. When you have a wonderful mother-in-law who takes sides with you in"
			+ " squabbles with her own daughter - that’s something. When you have a father and"
			+ " a mother who work all their lives so you can have an education and build your"
			+ " body - it’s a blessing. When you have a wife who has been a tower of strength"
			+ " and shown more courage than you dreamed existed — that’s the finest I know."
			+ " So I close in saying that I may have had a tough break, but I have an awful"
			+ " lot to live for. ---Lou Gehrig";

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Hello and welcome to this super neat program.");
		System.out.println("Today you will be formating super neat speeches.");
		System.out.println("Below are your options for super neat speeches.");
		System.out.println("------------------------------------------------");
		System.out.println("1:  Abraham Lincoln's Gettysburg Address");
		System.out.println("2:  George Washington's retirement speech");
		System.out.println("3:  Lou Gehrig baseball speech");
		System.out.println("------------------------------------------------");
		System.out.println("Let's get started shall we?");
		
		//User input 1 & restrictions
		System.out.println("Please select a speech to format. (1, 2, or 3): ");
		String speechChoice = scr.nextLine();
		while(speechChoice.isEmpty() == true || speechChoice.contains(" ")) {
			System.out.println("Error: Nothing entered. ");
			System.out.println("Please enter a 1, 2 or 3: ");
			speechChoice = scr.nextLine();
		}
		int choiceNum = Integer.parseInt(speechChoice);
		while(!(choiceNum >= 1 && choiceNum <= 3)) {
			System.out.println("Error: invalid number selected. Number must be from 1-3.");
			System.out.println("Please enter a VALID number 1-3: ");
			choiceNum = scr.nextInt();
		}
		if(choiceNum == 1) {
			System.out.println("You chose: Gettysburg Address");
		}
		else if(choiceNum == 2) {
			System.out.println("You chose: Retirement speech");
		}
		else
			System.out.println("You chose: Baseball speech");
		
		//User Input 2 & restricions
		System.out.println("Please enter number of indents per first line, between 0-2: ");
		String indentChoice = scr.nextLine();
		while(indentChoice.isEmpty() == true || indentChoice.contains(" ") || indentChoice.contains("  ") || indentChoice.contains("   ") 
				|| indentChoice.contains("    ") || indentChoice.contains("    ") || indentChoice.contains("       ")){
			System.out.println("Error: Nothing entered. ");
			System.out.println("Please enter a 0, 1 or 2: ");
			indentChoice = scr.nextLine();
		}
		int indentNum = Integer.parseInt(indentChoice);
		while(!(indentNum >= 0 && indentNum <= 2)) {
			System.out.println("Error: invalid number selected. Number must be from 0-2.");
			System.out.println("Please enter a VALID number 0-2: ");
			indentNum = scr.nextInt();
		}
		if(indentNum == 0) {
			System.out.println("'0' is a valid number");
		}
		else if(indentNum == 1 ) {
			System.out.println("'1' is a valid number");
		}
		else
			System.out.println("'2' is a valid number");
		
		
		//User input 3 & restrictions
		System.out.println("Please enter number of characters allowed per line, between 30-120: ");
		String characterChoice = scr.nextLine();
		while(characterChoice.isEmpty() == true || characterChoice.contains(" ") || characterChoice.contains("  ") || characterChoice.contains("   ") 
				|| characterChoice.contains("    ") || characterChoice.contains("    ") || characterChoice.contains("       ")){
			System.out.println("Error: Nothing entered. ");
			System.out.println("Please enter a number between 30 and 120: ");
			characterChoice = scr.nextLine();
		}
		int characterNum = Integer.parseInt(characterChoice);
		while(!(characterNum >= 30 && characterNum <= 120)) {
			System.out.println("Error: invalid number selected. Number must be from 30-120.");
			System.out.println("Please enter a VALID number 30-120: ");
			characterNum = scr.nextInt();
		}
		System.out.println("'" + characterNum + "' is a valid number");
		
		//User input 4 & restrictions
		System.out.println("Please enter number of sentences per paragraph, between 3-8: ");
		String sentenceChoice = scr.nextLine();
		while(sentenceChoice.isEmpty() == true || sentenceChoice.contains(" ") || sentenceChoice.contains("  ") || sentenceChoice.contains("   ") 
				|| sentenceChoice.contains("    ") || sentenceChoice.contains("    ") || sentenceChoice.contains("       ")){
			System.out.println("Error: Nothing entered. ");
			System.out.println("Please enter a number between 3 and 8: ");
			sentenceChoice = scr.nextLine();
		}
		int sentenceNum = Integer.parseInt(sentenceChoice);
		while(!(sentenceNum >= 3 && sentenceNum <= 8)) {
			System.out.println("Error: invalid number selected. Number must be from 3-8.");
			System.out.println("Please enter a VALID number 3-8: ");
			sentenceNum = scr.nextInt();
		}
		System.out.println("'" + sentenceNum + "' is a valid number");
		
		
		
		scr.close();
	}
}
