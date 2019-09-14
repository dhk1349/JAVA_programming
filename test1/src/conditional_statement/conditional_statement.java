package conditional_statement;
import java.util.Scanner;

public class conditional_statement {
	public static void twenties() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type your age: ");
		int age=scanner.nextInt();
		if((age>=20)&&(age<30)) {
			System.out.print("You r twenties\n");
		}
		else {
			System.out.print("You are not twenties\n");
		}
		scanner.close();
	}
	public static void season() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type month\n");
		
		int month = scanner.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.print("It's spring\n");
			break;
		case 6: case 7: case 8:
			System.out.print("It's summer\n");
			break;
		case 9: case 10: case 11:
			System.out.print("It's fall\n");
			break;
		case 12: case 1: case 2:
			System.out.print("It's winter\n");
			break;
		default:
			System.out.print("There is no such month\n"); 
		}
	}
	public static void main(String args[]) {
		season();
	}
}
