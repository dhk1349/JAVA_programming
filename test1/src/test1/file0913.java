package test1;
import java.util.Scanner;

public class file0913 {
	public static void main(String args[]) {
	System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력.");	
		
	Scanner scanner = new Scanner(System.in);
	String Name = scanner.next();
	String City = scanner.next();
	String Age = scanner.next();
	String Weight = scanner.next();
	String Single = scanner.next();	
	System.out.println("당신의 이름은 " + Name);
	System.out.println("당신이 사는 도시는 " + City);
	System.out.println("당신의 나이는  " + Age);
	System.out.println("당신의 몸무게는" + Weight);
	System.out.println("당신의 독신 여부는" + Single);
	
	scanner.close();
	}
}
