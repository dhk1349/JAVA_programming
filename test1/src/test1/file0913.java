package test1;
import java.util.Scanner;

public class file0913 {
	public static void main(String args[]) {
	System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է�.");	
		
	Scanner scanner = new Scanner(System.in);
	String Name = scanner.next();
	String City = scanner.next();
	String Age = scanner.next();
	String Weight = scanner.next();
	String Single = scanner.next();	
	System.out.println("����� �̸��� " + Name);
	System.out.println("����� ��� ���ô� " + City);
	System.out.println("����� ���̴�  " + Age);
	System.out.println("����� �����Դ�" + Weight);
	System.out.println("����� ���� ���δ�" + Single);
	
	scanner.close();
	}
}
