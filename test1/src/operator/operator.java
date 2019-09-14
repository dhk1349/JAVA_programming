package operator;
import java.util.Scanner;
public class operator {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type interger: ");
		int time =  scanner.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.print(time + " is ");
		System.out.print(hour + " hours ");
		System.out.print(minute + " minutes ");
		System.out.println(second + " seconds ");
		scanner.close();
	}
}
