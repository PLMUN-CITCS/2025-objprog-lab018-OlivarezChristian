import java.util.Scanner;
	public class EvenOddChecker{
		//method to get user input
		public static int getIntegerInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int userNum = input.nextInt();
		return userNum;
		}
		//method to check user input
		public static String checkEvenOrOdd(int userNum){
		if(userNum % 2 == 0) {
		return userNum + " is an even number ";
		} else {
		return userNum + " is an odd number ";
		}
		}

	public static void main(String[] args) {
		System.out.println(checkEvenOrOdd(getIntegerInput()));
	}
}