import java.util.Scanner;
public class solu1 {
	
	public static void main(String[] String) {
		Scanner input = new Scanner(System.in);
		//both female and male
		
		Scanner in = new Scanner (System.in);
		//declare the variable
		double feet,inches;
		
		System.out.print("Input the inches : ");
		inches = in.nextDouble();
		System.out.print("Input the feet");
		feet = in.nextDouble();
		
		//calculate for female and male
		System.out.println("Female weight is " +(40+(5*feet))+" kg");
		System.out.println("Male weight is " + (50+(5*feet))+" kg");
		
			
	}
	
}
