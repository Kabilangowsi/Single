package datatypes;
import java.util.Scanner;

public class If {
	
	
	public static void main(String[] args) {
		
		Scanner tyr = new Scanner(System.in);
		System.out.println("Enter The Amount ");
		int part1 = tyr.nextInt();
		byte part2 = tyr.nextByte();
		System.out.println("Discounts:"+ +part1/part2);
		System.out.println("Total balance");
		System.out.println(part1-part1/part2);
		System.out.println("Thanking you Have a Nice day!!!!!");
		
		tyr.close();
		
	}

}
