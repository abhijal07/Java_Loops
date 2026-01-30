//To find the sum of n numbers..
import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		int result=0;
		for(int i=1;i<=num;i++) {
			result=result+i;
		}
		System.out.print("Sum of "+num+"numbers is "+result);
		sc.close();
	}
}
