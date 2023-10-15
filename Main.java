import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Calculator calculator = new Calculator();
		
		System.out.print("Year: ");
		calculator.setY(in.nextInt());
		in.nextLine();
		
		System.out.println(calculator.calculateEaster(calculator.getY()));
		return;
	}

}
