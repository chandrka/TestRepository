		import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1%2==0 && num2%2==0)
		{
			if(num1>num2)
		System.out.println(num1-num2);
			else
				System.out.println(num2-num1);
		}

		else if(num1%2!=0 && num2%2!=0)
		{
		System.out.println(num1+num2);
		}
		}

	}
