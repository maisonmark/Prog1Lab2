import java.util.*;
public class BMI
{
	public static void main(String[] args) {

		Scanner keyinput = new Scanner(System.in);
		System.out.println("\nPlease enter the required info below to calculate your BMI");

		System.out.println("How much do you weigh in pounds?");
		double weight = keyinput.nextDouble();

		System.out.println("How tall do you mesure in feet?");
		double height = keyinput.nextDouble();

		double kiloweight = weight / 2.205;
		double meterheight = height / 3.281;
		double totalBMI = kiloweight / Math.pow(meterheight,2);

		System.out.printf("Your total BMI is %.1f", totalBMI);



	}

}