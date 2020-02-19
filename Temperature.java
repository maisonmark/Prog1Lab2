import java.util.*;
public class Temperature
{
	public static void main(String[] args) {
		
		Scanner keyinput = new Scanner(System.in);
		System.out.println("Please enter the temperatures of the past 3 days in degrees Celsius below");
		
		System.out.println("3 days ago:");
		int day3 = keyinput.nextInt();

		System.out.println("2 days ago:");
		int day2 = keyinput.nextInt();

		System.out.println("1 day ago:");
		int day1 = keyinput.nextInt();

		int averageTemp = (day3 + day2 + day1) / 3;

		System.out.println("The average temperature of these past three days was " + averageTemp + " degrees Celsius");

		
	}

}