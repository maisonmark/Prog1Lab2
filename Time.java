import java.util.*;
public class Time
{
	public static void main(String [] args){
		
		// Prompts the user for the amount of seconds they would like to convert
		Scanner keyinput = new Scanner(System.in);
		System.out.println("Please enter the amount of seconds you would like to convert into minutes");
		int seconds = keyinput.nextInt();

		int seconds_inminute = 60;
		int minute;

		minute = seconds / seconds_inminute;
		seconds -= minute * seconds_inminute;


		System.out.println(" The time is: " + minute + ":" + seconds);

	

	}
}