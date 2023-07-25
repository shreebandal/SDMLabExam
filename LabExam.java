import java.util.Scanner;
class LabExam{
    public static int factorial(int num) {
		if(num<0) return -1;
		else if(num>=0 && num<=2) return num;
		else return num*factorial(num-1);
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			System.out.println("Factorial of given number is "+factorial(num));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}