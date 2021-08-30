package newRandomPackage;
import java.util.Scanner;

public class Inputclass extends LogicClass {
	Scanner sc = new Scanner(System.in);
	
	public void getInput() throws Exception{
        while(true) {
            try {
            	System.out.println("Enter the value of a: ");
            	int a = sc.nextInt();
                
                System.out.println("Enter the value of b: ");
                int b = sc.nextInt();
                
                submission(a, b);
                
            }
            catch (ArithmeticException e) {
                System.out.println("cant divide by 0");
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Invalid input, try again");
            }
        }
	}
}
