import java.util.Scanner;

import java.util.Scanner;
public class PascalTriangel {
	
	public static void pascal(int order) {
		
		for (int i=0; i<order; i++)
		{
			int num=1;
			for(int j=order; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for (int p=0; p<=i; p++)
			{
				System.out.print(num+" ");
				num=num*(i-p)/(p+1);
			}
			
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to create the pascal triangel: \n");
		while(!input.hasNextInt())
		{
			System.out.println("Please use just numbers");
			input.nextLine();
		}
		int order = input.nextInt();
		pascal(order);
		input.close();

	}

}
