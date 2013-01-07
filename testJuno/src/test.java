import java.util.Scanner;
public class test
{

	public static void main(String[] args)
	{
		System.out.println("hello world");
		System.out.println("this is 28kayak");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("waht is your name??");
		String userName = scan.nextLine();
		System.out.println("welcome" + userName);
		
		scan.close();//why do we need to close scan unlike previous apps?? 

	}

}
