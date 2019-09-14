package iterative_statement;
import java.util.Scanner;

public class iterative_statement {
	public static void print_diamond() {
		System.out.print("Type size of diamond >> ");
		Scanner scanner=new Scanner(System.in);
		
		int size=scanner.nextInt();
		size/=2;
		//upper part
		for(int i=1;i<=size;i++){//iterates each floor
			for(int j=size;j>=1;j--) {
				if(i==j) {System.out.print("/");}
				else {System.out.print(" ");}
			}
			for(int j=1;j<=size;j++) {
				if(i==j) {System.out.print("\\");}
				else {System.out.print(" ");}
			}
			System.out.println();
			
		}
		//lower part
		for(int i=size;i>=1;i--){//iterates each floor
			for(int j=size;j>=1;j--) {
				if(i==j) {System.out.print("\\");}
				else {System.out.print(" ");}
			}
			for(int j=1;j<=size;j++) {
				if(i==j) {System.out.print("/");}
				else {System.out.print(" ");}
			}
			System.out.println();
			
		}
	}
	
	public static void main(String args[]) {
		print_diamond();
	}
}
