import java.util.Scanner;





public class Dice { 
	

public static void main(String[] args) { 
	
	  

Scanner input = new Scanner( System.in );
		

int userNum;
		
int computerNum;


String userGuess;
String choice;
int count = 0;
int wins = 0;
int even = 0;
int odd = 0;

do{


	
	  
computerNum = 1 + (int)(Math.random() * ((6 - 1) + 1))
;
	  
	  
	 


System.out.println("Guess whether the dice you just rolled is even or odd: ");

userGuess = input.nextLine();

if (userGuess.equals("even"))
	even++;
else
	odd++;


System.out.println("The dice that was rolled was a " + computerNum);


if ( (computerNum == 2 ) || (computerNum == 4 ) || (computerNum == 6 )){
	if (userGuess.equals("even")){
		System.out.println("you got it! it was even");
		wins++;
		even++;
}
	else if (userGuess.equals("odd"))
		System.out.println("you guessed wrong!");

}

else if ( (computerNum == 1 ) || (computerNum == 3 ) || (computerNum == 5 )){
	if (userGuess.equals("odd")){
		System.out.println("you got it! it was odd");
		wins++;
		odd++;
}
	else if(userGuess.equals("even"))
		System.out.println("you guessed wrong!");
}

System.out.println("Do you want to play again? (yes or no): ");
choice = input.nextLine();
count++;


} while (choice.equals("yes"));

System.out.println("You played " + count + " times!");
System.out.println("And you won " + wins + " times!");
System.out.println("You guessed even a total of " + even + " times!");
System.out.println("And you guessed odd a total of " + odd + " times!");

	  
	  
  


}
}