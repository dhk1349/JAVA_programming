package test1;
import java.util.Scanner;

public class file0913 {
	public static void time() {
	System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է�.");	
		
	Scanner scanner = new Scanner(System.in);
	String Name = scanner.next();
	String City = scanner.next();
	int Age = scanner.nextInt();
	String Weight = scanner.next();
	String Single = scanner.next();	
	System.out.println("����� �̸��� " + Name);
	System.out.println("����� ��� ���ô� " + City);
	System.out.println("����� ���̴�  " + Age);
	System.out.println("����� �����Դ�" + Weight);
	System.out.println("����� ���� ���δ� " + Single);
	
	scanner.close();
	}
	public static void bitoperator() {
		short a =(short) 0x55ff;
		short b =(short) 0x00ff;
		System.out.printf("a = %04x",a);
		System.out.printf(" b = %04x\n",b);
		
		System.out.println("[Bit operator]");
		System.out.printf("a & b = %04x\n", (short)a&b);
		System.out.printf("a | b = %04x\n", (short)a|b);
		System.out.printf("a ^ b = %04x\n", (short)a^b);
		System.out.printf("~a = %04x\n\n", (short)~a);
		
		byte c = 20;
		byte d = -8;
		//System.out.printf("c = %02x ", c);
		//System.out.printf("d = %02x\n", d);

		System.out.println("[Shift operator]");
		System.out.println(c << 2);
		System.out.println(c>>2);
		System.out.println( d>>2);
		System.out.println(d<<2);
		
	}
	public static void main(String args[]) {
		bitoperator();
	}
}
