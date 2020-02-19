import java.util.*;
public class Name
{
	public static void main(String[] args) {
		
		Scanner keyinput = new Scanner(System.in);
		System.out.println("\nType the name in the format 'last name, firstname' ");

		String firstFormat = keyinput.nextLine();

		int indexComma = firstFormat.indexOf(',');

		System.out.printf("%nYou have inserted '%s'", firstFormat);
		System.out.printf("%nIndex of comma is %d", indexComma);

		String last = firstFormat.substring(0,indexComma);

		last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

		String first = firstFormat.substring(indexComma+2);
		first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

		System.out.printf("%nFirst name is '%s'", first);

		System.out.printf("%nLast name is '%s'", last);

		System.out.printf("%nThe final format is %s %s", first, last);


	}
}
