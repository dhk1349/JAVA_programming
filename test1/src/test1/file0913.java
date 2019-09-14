package test1;
import java.util.Scanner;

public class file0913 {
	public static void time() {
	System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력.");	
		
	Scanner scanner = new Scanner(System.in);
	String Name = scanner.next();
	String City = scanner.next();
	int Age = scanner.nextInt();
	String Weight = scanner.next();
	String Single = scanner.next();	
	System.out.println("당신의 이름은 " + Name);
	System.out.println("당신이 사는 도시는 " + City);
	System.out.println("당신의 나이는  " + Age);
	System.out.println("당신의 몸무게는" + Weight);
	System.out.println("당신의 독신 여부는 " + Single);
	
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
